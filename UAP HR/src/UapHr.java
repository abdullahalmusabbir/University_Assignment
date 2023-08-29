import java.util.ArrayList;
import java.util.Scanner;

public class UapHr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company uapHr = new Company("UAP HR");

        int choice;
        do {
            System.out.println("Employee Record System - UAP HR\n1. Add a new employee\n2. Update salary of an employee\n3. Promote an employee\n4. Display details of a specific employee\n5. Display details of all employees\n0. Exit");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee designation: ");
                    String designation = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); 
                    uapHr.addNewEmployee(name, designation, salary);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.print("Enter employee ID: ");
                    String idToUpdateSalary = scanner.nextLine();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    uapHr.updateSalary(idToUpdateSalary, newSalary);
                    System.out.println("Salary updated successfully.");
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    String idToPromote = scanner.nextLine();
                    System.out.print("Enter new designation: ");
                    String newDesignation = scanner.nextLine();
                    System.out.print("Enter new salary: ");
                    double newPromotedSalary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    uapHr.promote(idToPromote, newDesignation, newPromotedSalary);
                    System.out.println("Employee promoted successfully.");
                    break;

                case 4:
                    System.out.print("Enter employee ID: ");
                    String idToDisplay = scanner.nextLine();
                    Employee employeeToDisplay = uapHr.findEmployee(idToDisplay);
                    if (employeeToDisplay != null) {
                        System.out.println(employeeToDisplay);
                    } else {
                        System.out.println("Not a valid ID.");
                    }
                    break;

                case 5:
                    ArrayList<Employee> allEmployees = uapHr.getEmployees();
                    for (Employee employee : allEmployees) {
                        System.out.println(employee);
                    }
                    break;

                case 0:
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}