
import java.util.*;

class Employee {
    int id;
    String name;
    String email;
    double salary;

    Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Email: " + email +
               ", Salary: " + salary;
    }
}

public class EmployeeRecord {

    public static void main(String[] args) {

        // 1. ArrayList to store names of at least 5 employees
        ArrayList<String> employeeNames = new ArrayList<>();

        employeeNames.add("Ashvini");
        employeeNames.add("Rahul");
        employeeNames.add("Priya");
        employeeNames.add("Amit");
        employeeNames.add("Sneha");

        // 2. Display all employee names
        System.out.println("Employee Names:");

        for (String name : employeeNames) {
            System.out.println(name);
        }

        // 3. TreeSet to store employee salaries
        // Salaries will be displayed in ascending order
        TreeSet<Double> salaries = new TreeSet<>();

        salaries.add(45000.0);
        salaries.add(55000.0);
        salaries.add(35000.0);
        salaries.add(60000.0);
        salaries.add(40000.0);

        System.out.println("\nEmployee Salaries (Ascending Order):");

        for (Double salary : salaries) {
            System.out.println(salary);
        }

        // 4. HashMap to store Employee ID as key
        // and Employee Name as value
        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Ashvini");
        employeeMap.put(102, "Rahul");
        employeeMap.put(103, "Priya");
        employeeMap.put(104, "Amit");
        employeeMap.put(105, "Sneha");

        System.out.println("\nEmployee ID and Names:");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }

        // 5. Store employee records
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ashvini",
                "ashvini@gmail.com", 45000.0));

        employees.add(new Employee(102, "Rahul",
                "rahul@gmail.com", 55000.0));

        employees.add(new Employee(103, "Priya",
                "priya@gmail.com", 35000.0));

        employees.add(new Employee(104, "Amit",
                "amit@gmail.com", 60000.0));

        employees.add(new Employee(105, "Sneha",
                "sneha@gmail.com", 40000.0));

        // Search employee using email
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter employee email to search: ");
        String searchEmail = sc.nextLine();

        boolean found = false;

        for (Employee emp : employees) {

            if (emp.email.equalsIgnoreCase(searchEmail)) {
                System.out.println("\nEmployee Found:");
                System.out.println(emp);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found.");
        }

        // 6. Display all employee records
        System.out.println("\nAll Employee Records:");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}