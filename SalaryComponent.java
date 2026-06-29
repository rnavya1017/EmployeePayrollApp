public class SalaryComponent {

    private double basicSalary;
    private double hra;
    private double allowance;

    public SalaryComponent(double basicSalary,
                           double hra,
                           double allowance) {
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.allowance = allowance;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getAllowance() {
        return allowance;
    }

    public double getGrossSalary() {
        return basicSalary + hra + allowance;
    }
}