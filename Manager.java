class Manager extends User {

    private Object passwordHash;

    /*
     * Constructor
     * Role is fixed as MANAGER.
     */
    public Manager(String username,
                   String password) {

        super(username, password, "MANAGER");
    }

    /*
     * Manager authentication logic.
     */
    @Override
    public boolean authenticate(String username,
                                String password) {

        return this.getUsername().equals(username)
                &&
               this.passwordHash.equals(
                       PasswordUtil.hash(password));
    }
    @Override
    public void displayRoleDashboard() {
        System.out.println("Manager Dashboard");
        System.out.println("Approve Leaves | Review Performance");
    }
}