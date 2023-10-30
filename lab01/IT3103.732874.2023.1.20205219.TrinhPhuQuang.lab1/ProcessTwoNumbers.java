import javax.swing.*;
import java.awt.event.*;
public class ProcessTwoNumbers {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");// Creating the main frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        frame.setSize(1000, 100);// Set size for the frame

        JPanel panel = new JPanel(); // Creating the panel to hold components
        // Adding components to the panel
        JTextField inputField1 = new JTextField(10); // 1st input field
        panel.add(new JLabel("Enter the first number:"));
        panel.add(inputField1);
        JTextField inputField2 = new JTextField(10); // 2rd input field
        panel.add(new JLabel("Enter the second number:"));
        panel.add(inputField2);

        JButton calculateButton = new JButton("Calculate");// Calculate button
        panel.add(calculateButton);
        JLabel resultLabel = new JLabel("Results:"); // results label
        panel.add(resultLabel);
        frame.add(panel); // Adding the panel to the frame

        calculateButton.addActionListener(new ActionListener() { // Adding ActionListener to the Calculate button
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieving text from input fields
                String strNum1 = inputField1.getText();
                String strNum2 = inputField2.getText();

                // Converting text to double
                double num1 = Double.parseDouble(strNum1);
                double num2 = Double.parseDouble(strNum2);

                //calculate
                double sum = num1 + num2;
                double difference = num1 - num2;
                double product = num1 * num2;
                double quotient;

                //show result
                if (num2 != 0) {
                    quotient = num1 / num2;
                    resultLabel.setText("Results: Sum=" + sum + ", Difference=" + difference + "\n Product=" + product + ", Quotient=" + quotient);
                } else {
                    resultLabel.setText("Cannot divide by zero. Please enter a non-zero second number.");
                }
            }
        });
        // Displaying the frame
        frame.setVisible(true);
    }
}

