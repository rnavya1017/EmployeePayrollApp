public class Employee {

    private String empId;
    private String name;
    private String department;

    public Employee(String empId,
                    String name,
                    String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}