import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class AuthenticationService {
    // Acts as our dynamic data store
    private Map<String, User> users = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    /**
     * Accepts credentials from the user to register them into the system.
     */
    public void register() {
        System.out.println("======= REGISTRATION =======");
        System.out.print("Enter New Username: ");
        String username = scanner.next();

        // Check if username already exists
        if (users.containsKey(username)) {
            System.out.println("Registration Failed: Username already taken!\n");
            return;
        }

        System.out.print("Enter Password: ");
        String password = scanner.next();
        
        System.out.print("Enter Role (Employee / Manager): ");
        String role = scanner.next();

        User newUser;
        if (role.equalsIgnoreCase("Manager")) {
            newUser = new Manager(username, password);
        } else {
            // Defaults to RegularEmployee if input doesn't match "Manager"
            newUser = new RegularEmployee(username, password);
        }

        users.put(username, newUser);
        System.out.println("Registration Successful for user: " + username + " as " + newUser.getRole() + "!\n");
    }

    /**
     * Handles the login verification loop using live input credentials.
     */
    public Session login() {
        System.out.println("======= LOGIN =======");
        System.out.print("Enter Username: ");
        String username = scanner.next();
        System.out.print("Enter Password: ");
        String password = scanner.next();
        System.out.println(); // Formatting newline

        User user = users.get(username);

        // Validate input credentials against dynamically registered data
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login Successful!");
            System.out.println("Role: " + user.getRole());
            System.out.println();
            
            showDashboard();
            user.displayRoleDashboard();
            System.out.println();
            
            return new Session(username);
        } else {
            System.out.println("Authentication Failed: Invalid credentials.\n");
            return null;
        }
    }

    private void showDashboard() {
        System.out.println("======= DASHBOARD =======");
    }
}