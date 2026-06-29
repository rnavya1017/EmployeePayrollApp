import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    private String empId;
    private String name;
    private String email;
    private String phone;

    private UserAccount userAccount;

    public Employee(String empId, String name, String email, String phone) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void persist() throws IOException {

    try (FileWriter writer =
            new FileWriter("employee_data.txt")) {

        writer.write(toString());
    }

    System.out.println(
            "\nData persisted in file: employee_data.txt");
}
}
