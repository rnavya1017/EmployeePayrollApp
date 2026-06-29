public class Employee {

    private String empId;
    private String empName;
    private String role;

    public Employee(String empId,
                    String empName,
                    String role) {

        this.empId = empId;
        this.empName = empName;
        this.role = role;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getRole() {
        return role;
    }
}