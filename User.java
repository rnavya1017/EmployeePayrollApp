abstract class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    // Polymorphic method to show unique dashboards per class type
    public abstract void displayRoleDashboard();

    public boolean authenticate(String username, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authenticate'");
    }
}

class RegularEmployee extends User {
    public RegularEmployee(String username, String password) {
        super(username, password, "EMPLOYEE");
    }

    @Override
    public void displayRoleDashboard() {
        System.out.println("Employee Dashboard");
        System.out.println("View Payslip | Update Profile");
    }
}

class Manager extends User {
    public Manager(String username, String password) {
        super(username, password, "MANAGER");
    }

    @Override
    public void displayRoleDashboard() {
        System.out.println("Manager Dashboard");
        System.out.println("Approve Leaves | Review Performance");
    }
}