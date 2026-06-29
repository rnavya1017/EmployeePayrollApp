import java.util.Scanner;

public class Usecase4PayslipDownloadApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("===== Final Payslip Generation =====");

            System.out.print("Enter Employee ID: ");
            String empId = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Gross Salary: ");
            double grossSalary = sc.nextDouble();

            System.out.print("Enter Total Deduction: ");
            double deduction = sc.nextDouble();

            FinalPayslip payslip =
                    new FinalPayslip(
                            empId,
                            empName,
                            grossSalary,
                            deduction);

            System.out.println("\nGenerated Payslip:");
            System.out.println(payslip);

            // Clone the object
            FinalPayslip copy =
                    (FinalPayslip) payslip.clone();

            System.out.println(
                    "\nPayslip cloned successfully.");

            System.out.println(
                    "Download Token: "
                    + copy.getToken());

            // Save to file
            FileService.downloadFinalPayslip(copy);

        }
        catch (Exception e) {
            System.out.println(
                    "Error: " + e.getMessage());
        }

        sc.close();
    }
}