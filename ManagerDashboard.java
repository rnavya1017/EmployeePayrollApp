public class ManagerDashboard
        implements Dashboard {

    @Override
    public void display(Employee employee,
                        PaySlip payslip) {

        System.out.println(
            "\n===== MANAGER DASHBOARD =====");

        System.out.println(
            "Employee ID : "
            + employee.getEmpId());

        System.out.println(
            "Employee Name : "
            + employee.getEmpName());

        System.out.println(
            "Role : "
            + employee.getRole());

        System.out.println(
            "Net Salary : "
            + payslip.getNetSalary());

        System.out.println(
            "Manager can approve payroll.");
    }
}