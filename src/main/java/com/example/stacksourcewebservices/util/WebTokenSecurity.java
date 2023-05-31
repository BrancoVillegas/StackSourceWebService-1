package com.example.stacksourcewebservices.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.security.SecureRandom;
import java.util.Base64;
public class WebTokenSecurity {
    public static String generateSecretKey() {
        byte[] keyBytes = new byte[64];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(keyBytes);
        return Base64.getEncoder().encodeToString(keyBytes);
    }
    private static final String SECRET_KEY = generateSecretKey();
    private static final long EXPIRATION_TIME = 3600000; // 1 hora

    public static String generateToken(String email) {
        Date now = new Date();
        Date expiration = new Date(now.getTime() + EXPIRATION_TIME);

        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(now)
                .setExpiration(expiration)
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
    public static boolean validateToken(String token, String email) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(SECRET_KEY)
                    .parseClaimsJws(token)
                    .getBody();

            String tokenEmail = claims.getSubject();

            return email.equals(tokenEmail);
        } catch (Exception e) {
            return false;
        }
    }
}
