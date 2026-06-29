import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class PasswordUtil {

    /*
     * Converts a plain-text password into a hashed value.
     *
     * Same input -> same hash
     * Original password cannot be derived back
     */
    public static String hash(String password) {

        try {
            MessageDigest md =
                    MessageDigest.getInstance("SHA-256");

            byte[] hashBytes =
                    md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();

            for (byte b : hashBytes) {
                sb.append(
                    String.format("%02x", b));
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(
                    "Hashing algorithm not found.");
        }
    }
}