import java.util.Scanner;

public class InputValidateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print(
                    "Enter Employee ID: ");
            String empId =
                    sc.nextLine();

            ValidationService
                    .validateEmpId(empId);

            System.out.print(
                    "Enter Email: ");
            String email =
                    sc.nextLine();

            ValidationService
                    .validateEmail(email);

            System.out.print(
                    "Enter Phone Number: ");
            String phone =
                    sc.nextLine();

            ValidationService
                    .validatePhone(phone);

            System.out.println(
                    "\nAll inputs are valid.");

        }
        catch (PhoneValidationException e) {

            System.out.println(
                    "Validation Error: "
                    + e.getMessage());
        }
        catch (EmailValidationException e) {

            System.out.println(
                    "Email Error: "
                    + e.getMessage());
        }
        catch (PasswordValidationException e) {

            System.out.println(
                    "Password Error: "
                    + e.getMessage());
        }
        catch (ValidationException e) {

            System.out.println(
                    "Validation Error: "
                    + e.getMessage());
        }

        sc.close();
    }
}