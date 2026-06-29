public class FinalPayslip implements Cloneable {

    private String employeeId;
    private String employeeName;
    private double grossSalary;
    private double deduction;
    private double netSalary;

    private DownloadToken token;

    public FinalPayslip(String employeeId,
                        String employeeName,
                        double grossSalary,
                        double deduction) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.grossSalary = grossSalary;
        this.deduction = deduction;

        this.netSalary =
                grossSalary - deduction;

        this.token =
                new DownloadToken();
    }

    public DownloadToken getToken() {
        return token;
    }

    @Override
    public Object clone()
            throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public String toString() {

        return "========== FINAL PAYSLIP ==========\n" +
               "Employee ID    : " + employeeId +
               "\nEmployee Name  : " + employeeName +
               "\nGross Salary   : " + grossSalary +
               "\nDeduction      : " + deduction +
               "\nNet Salary     : " + netSalary +
               "\nDownload Token : " + token +
               "\n===================================";
    }
}