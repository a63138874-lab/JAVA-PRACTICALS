import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeManagement extends JFrame implements ActionListener {

    JLabel nameLabel, idLabel, salaryLabel, resultLabel;
    JTextField nameField, idField, salaryField;
    JButton submitButton;

    EmployeeManagement() {

        // Frame
        setTitle("Employee Management System");
        setSize(450, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        nameLabel = new JLabel("Employee Name:");
        idLabel = new JLabel("Employee ID:");
        salaryLabel = new JLabel("Salary:");

        // Text Fields
        nameField = new JTextField(20);
        idField = new JTextField(20);
        salaryField = new JTextField(20);

        // Submit Button
        submitButton = new JButton("Submit");

        // Result Label
        resultLabel = new JLabel(" ");

        // Add components to Frame
        add(nameLabel);
        add(nameField);

        add(idLabel);
        add(idField);

        add(salaryLabel);
        add(salaryField);

        add(submitButton);
        add(resultLabel);

        // Event Handling
        submitButton.addActionListener(this);

        setVisible(true);
    }

    // Action performed when Submit button is clicked
    public void actionPerformed(ActionEvent e) {

        // Read values
        String name = nameField.getText();
        String employeeId = idField.getText();
        String salaryText = salaryField.getText();

        // Validate fields
        if (name.isEmpty() || employeeId.isEmpty() || salaryText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill all fields!");
            return;
        }

        try {
            double salary = Double.parseDouble(salaryText);

            // Validate salary
            if (salary < 0) {
                JOptionPane.showMessageDialog(this,
                        "Salary cannot be negative!");
                return;
            }

            // Calculate salary category
            String category;

            if (salary >= 50000)
                category = "High";
            else if (salary >= 30000)
                category = "Medium";
            else
                category = "Low";

            // Display employee details
            resultLabel.setText(
                    "<html>Employee Name: " + name
                    + "<br>Employee ID: " + employeeId
                    + "<br>Salary: ₹" + salary
                    + "<br>Salary Category: " + category
                    + "</html>"
            );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid salary!");
        }
    }

    public static void main(String[] args) {
        new EmployeeManagement();
    }
}