import java.util.Random;

public class Employee {
    private String name;
    private String id;
    private String designation;
    private double salary;

    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        generateId();
    }

    private void generateId() {
        Random rand = new Random();
        String num = 1000 + rand.nextInt(8999) + "";
        this.id = num;
    }

    public void updateSalary(double newSal) {
        this.salary = newSal;
    }

    public void promote(String newDesignation, double newSal) {
        this.designation = newDesignation;
        this.salary = newSal;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Id: " + id + "; Designation: " + designation + "; Salary: " + salary;
    }
}