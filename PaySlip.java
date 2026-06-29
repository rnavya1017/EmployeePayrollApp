public class PaySlip {

    // Composition
    private Employee employee;
    private SalaryComponent salary;

    public PaySlip(Employee employee,
                   SalaryComponent salary) {
        this.employee = employee;
        this.salary = salary;
    }

    public double calculatePF() {
        return salary.getBasicSalary() * 0.12;
    }

    public double calculateNetSalary() {
        return salary.getGrossSalary() - calculatePF();
    }

    @Override
    public String toString() {

        return "\n========== PAYSLIP ==========\n" +
               "Employee ID   : " + employee.getEmpId() +
               "\nEmployee Name : " + employee.getName() +
               "\nDepartment    : " + employee.getDepartment() +

               "\n\nBasic Salary  : " + salary.getBasicSalary() +
               "\nHRA           : " + salary.getHra() +
               "\nAllowance     : " + salary.getAllowance() +

               "\nGross Salary  : " + salary.getGrossSalary() +
               "\nPF Deduction  : " + calculatePF() +
               "\nNet Salary    : " + calculateNetSalary() +

               "\n============================";
    }
}