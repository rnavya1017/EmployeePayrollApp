
import java.io.IOException;
import java.util.Scanner;

class EmployeeRegistrationApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- USE CASE 1: Employee Registration ---");
        try
        {
            System.out.print("Enter Employee ID (Format: EMP-XXXX): ");
            String empId = scanner.nextLine();
            Validator.validateEmpId(empId);

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            Validator.validateEmail(email);

            System.out.print("Enter Phone Number(10 digits starting with 6-9): ");
            String phone = scanner.nextLine();
            Validator.validatePhone(phone); 

            Employee employee = new Employee(empId, name, email, phone);
            System.out.println("Employee Registered Successfully!");
            System.out.println(employee);
            employee.persist();
        } 
        catch (ValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
       
    }
}