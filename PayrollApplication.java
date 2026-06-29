import java.util.Scanner;

public class PayrollApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        Employee employee =
                new Employee(empId,
                             name,
                             department);

        SalaryComponent salary =
                new SalaryComponent(basic,
                                    hra,
                                    allowance);

        PaySlip payslip =
                new PaySlip(employee,
                            salary);

        System.out.println(payslip);

        sc.close();
    }
}