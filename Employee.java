class Employee {
    int employeeId;
    String employeeName;
    double salary;

    // Constructor
    Employee(int id, String name, double sal) {
        employeeId = id;
        employeeName = name;
        salary = sal;
    }

    // Method to display employee information
    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ashwini", 50000);
        Employee e2 = new Employee(102, "Priya", 45000);

        e1.display();
        e2.display();
    }
}