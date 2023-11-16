package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private int password;
    private String[] healtplans;

    public Employee(int id, String fullName, String email, int password, String[] healtplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healtplans = healtplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public String[] getHealtplans() {
        return healtplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setHealtplans(String[] healtplans) {
        this.healtplans = healtplans;
    }

    public void addHealthplan(int index, String name) {
        if (index >= 0 && index < healtplans.length) {
            if (healtplans[index] == null) {
                healtplans[index] = name;
                System.out.println("New plan added!");
            } else {
                System.out.println("This plan with index: " + index + " is already exist!");
            }
        } else {
            System.out.println("Invalid index!");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", healtplans=" + Arrays.toString(healtplans) +
                '}';
    }
}
