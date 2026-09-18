import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationGUI extends JFrame implements ActionListener {

    JLabel nameLabel, rollLabel, marksLabel, resultLabel;
    JTextField nameField, rollField, marksField;
    JButton submitButton;

    StudentRegistrationGUI() {

        // Frame
        setTitle("Student Registration");
        setSize(450, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        nameLabel = new JLabel("Student Name:");
        rollLabel = new JLabel("Roll No:");
        marksLabel = new JLabel("Marks:");

        // Text Fields
        nameField = new JTextField(20);
        rollField = new JTextField(20);
        marksField = new JTextField(20);

        // Button
        submitButton = new JButton("Submit");

        // Result Label
        resultLabel = new JLabel(" ");

        // Add components to Frame
        add(nameLabel);
        add(nameField);

        add(rollLabel);
        add(rollField);

        add(marksLabel);
        add(marksField);

        add(submitButton);
        add(resultLabel);

        // Event Handling
        submitButton.addActionListener(this);

        setVisible(true);
    }

    // Action performed when Submit button is clicked
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String rollNo = rollField.getText();
        String marksText = marksField.getText();

        // Validate fields
        if (name.isEmpty() || rollNo.isEmpty() || marksText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill all fields!");
            return;
        }

        try {
            double marks = Double.parseDouble(marksText);

            // Validate marks
            if (marks < 0 || marks > 100) {
                JOptionPane.showMessageDialog(this,
                        "Marks must be between 0 and 100!");
                return;
            }

            // Calculate Grade
            String grade;

            if (marks >= 90)
                grade = "A+";
            else if (marks >= 80)
                grade = "A";
            else if (marks >= 70)
                grade = "B";
            else if (marks >= 60)
                grade = "C";
            else if (marks >= 50)
                grade = "D";
            else
                grade = "F";

            // Display student details
            resultLabel.setText("<html>Student Name: " + name
                    + "<br>Roll No: " + rollNo
                    + "<br>Marks: " + marks
                    + "<br>Grade: " + grade
                    + "</html>");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid marks!");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationGUI();
    }
}



