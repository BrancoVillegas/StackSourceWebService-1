import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

public class JwtUtils {
    private static final String SECRET_KEY = "clave_secreta"; // Reemplaza con tu propia clave secreta

    public static String getUsernameFromToken(String token) {
        Jws<Claims> claims = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token);

        return claims.getBody().getSubject();
    }
}