import java.util.Scanner;
public class UseCase2LoginApp {

    public static void main(String[] args) {
        System.out.println("=== USE CASE 2: EMPLOYEE AUTHENTICATION & LOGIN ===\n");

        AuthenticationService auth = new AuthenticationService();
        Scanner mainScanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Register New User");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = mainScanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    auth.register();
                    break;
                case 2:
                    Session session = auth.login();
                    if (session != null) {
                        System.out.println(session);
                        if (!session.isExpired()) {
                            System.out.println("Session active and valid.");
                        }
                        System.out.println("-----------------------------------------\n");
                    }
                    break;
                case 3:
                    System.out.println("Exiting Application.");
                    mainScanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
}