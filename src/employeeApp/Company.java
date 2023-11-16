package employeeApp;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if (giro < 0) {
            System.out.println("Giro cannot be lower than zero!!");
        }
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(int giro) {
        if (giro < 0) {
            System.out.println("Giro cannot be lower than zero!!");
        }
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println("New developer added.");
            } else {
                System.out.println("This developer with index: " + index + " is already exist!");
            }
        } else {
            System.out.println("Invalid index!");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
