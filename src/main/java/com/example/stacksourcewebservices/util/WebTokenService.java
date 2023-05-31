import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.SecureRandom;
import java.util.Base64;

public class JwtUtils {
    byte[] keyBytes = new byte[32];
    SecureRandom secureRandom = new SecureRandom();
    secureRandom.nextBytes(keyBytes);
    String base64Key = Base64.getEncoder().encodeToString(keyBytes);
    private static final String SECRET_KEY = base64Key;
    public static String generateToken(String username) {
        long expirationTime = 9000000;

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();

        return token;
    }
    public static String getUsernameFromToken(String token) {
        Claims claims = Jwts.parser()
                        .setSigningKey(SECRET_KEY)
                        .parseClaimsJws(token)
                        .getBody();

            return claims.getSubject();
    }
    public static boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
                return true;
            } catch (Exception ex) {
                return false;
                }
    }
}