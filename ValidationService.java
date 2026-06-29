public class ValidationService {

    /*
     * Checks whether an email follows a valid format.
     *
     * If the format is wrong:
     * - A ValidationException is thrown
     * - Program flow jumps to the catch block in main()
     */
    public static void validateEmail(String email)
            throws ValidationException {

        String emailPattern =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (!email.matches(emailPattern)) {
            throw new ValidationException(
                    "Invalid Email Format");
        }
    }

    /*
     * Validates Indian phone numbers.
     *
     * Rule:
     * - Must start with 6, 7, 8, or 9
     * - Must be exactly 10 digits
     */
    public static void validatePhone(String phone)
            throws ValidationException {

        String phonePattern = "^[6-9][0-9]{9}$";

        if (!phone.matches(phonePattern)) {
            throw new ValidationException(
                    "Invalid Phone Number");
        }
    }

    /*
     * Validates Employee ID format.
     *
     * Rule:
     * - Must follow EMP-XXXX where X is a digit
     */
    public static void validateEmpId(String empId)
            throws ValidationException {

        String empIdPattern = "^EMP-[0-9]{4}$";

        if (!empId.matches(empIdPattern)) {
            throw new ValidationException(
                    "Invalid Employee ID Format");
        }
    }
    // validate password 
    public static void validatePassword(String password)
        throws ValidationException {

    String pattern =
            "^(?=.*[a-z])" +
            "(?=.*[A-Z])" +
            "(?=.*\\d)" +
            "(?=.*[@#$%^&+=!])" +
            "(?=\\S+$).{8,}$";

    if (!password.matches(pattern)) {

        throw new ValidationException(
                "Password must contain at least "
                + "8 characters, one uppercase, "
                + "one lowercase, one digit, "
                + "and one special character.");
    }
}
}
