import java.io.FileWriter;
import java.io.IOException;

public class FileService {

    public static void downloadFinalPayslip(
            FinalPayslip payslip)
            throws IOException {

        FileWriter writer =
                new FileWriter("final_payslip.txt");

        writer.write(payslip.toString());

        writer.close();

        System.out.println(
            "Payslip downloaded successfully.");
    }
}