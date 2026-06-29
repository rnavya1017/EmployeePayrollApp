public class EmployeeDashboard
        implements Dashboard {

    @Override
    public void display(Employee employee,
                        PaySlip payslip) {

        System.out.println(
            "\n===== EMPLOYEE DASHBOARD =====");

        System.out.println(
            "Employee ID : "
            + employee.getEmpId());

        System.out.println(
            "Employee Name : "
            + employee.getEmpName());

        System.out.println(
            "Net Salary : "
            + payslip.getNetSalary());
    }
}