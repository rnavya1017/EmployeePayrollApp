public class PaySlip {

    private double basicSalary;
    private double hra;
    private double allowance;

    public PaySlip(double basicSalary,
                   double hra,
                   double allowance) {

        this.basicSalary = basicSalary;
        this.hra = hra;
        this.allowance = allowance;
    }

    public double getNetSalary() {

        double gross =
                basicSalary + hra + allowance;

        double pf = basicSalary * 0.12;

        return gross - pf;
    }
}