import java.util.Scanner;

public class DashboardDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print(
                "Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print(
                "Enter Role (EMPLOYEE/MANAGER): ");
        String role = sc.nextLine();

        System.out.print(
                "Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print(
                "Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print(
                "Enter Allowance: ");
        double allowance = sc.nextDouble();

        Employee employee =
                new Employee(
                        id,
                        name,
                        role);

        PaySlip payslip =
                new PaySlip(
                        basic,
                        hra,
                        allowance);

        Dashboard dashboard =
                DashboardFactory
                        .getDashboard(role);

        if (dashboard != null) {

            dashboard.display(
                    employee,
                    payslip);
        }
        else {

            System.out.println(
                    "Invalid Role");
        }

        sc.close();
    }
}