import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        employees = new ArrayList<>();
    }

    public void addNewEmployee(String name, String designation, double salary) {
        Employee newEmployee = new Employee(name, designation, salary);
        employees.add(newEmployee);
    }

    public Employee findEmployee(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void updateSalary(String id, double salary) {
        Employee employee = findEmployee(id);
        if (employee != null) {
            employee.updateSalary(salary);
        }
    }

    public void promote(String id, String newDesignation, double newSalary) {
        Employee employee = findEmployee(id);
        if (employee != null) {
            employee.promote(newDesignation, newSalary);
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getCompanyName() {
        return companyName;
    }
}