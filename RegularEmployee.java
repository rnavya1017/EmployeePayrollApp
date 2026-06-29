class RegularEmployee extends User {

    private Object passwordHash;

    /*
     * Constructor
     * Calls the parent constructor.
     * Role is fixed as EMPLOYEE.
     */
    public RegularEmployee(String username,
                           String password) {

        super(username, password, "EMPLOYEE");
    }

    /*
     * Authentication logic specific to employees.
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
}