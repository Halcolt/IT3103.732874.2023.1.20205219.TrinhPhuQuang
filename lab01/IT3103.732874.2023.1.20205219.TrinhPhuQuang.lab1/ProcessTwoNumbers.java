import javax.swing.*;
import java.awt.event.*;

public class ProcessTwoNumbers {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 100);

        JPanel panel = new JPanel();
        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);
        JLabel resultLabel = new JLabel("Results:");
        JButton calculateButton = new JButton("Calculate");

        panel.add(new JLabel("Enter the first number:"));
        panel.add(inputField1);
        panel.add(new JLabel("Enter the second number:"));
        panel.add(inputField2);
        panel.add(calculateButton);
        panel.add(resultLabel);
        frame.add(panel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strNum1 = inputField1.getText();
                String strNum2 = inputField2.getText();

                double num1 = Double.parseDouble(strNum1);
                double num2 = Double.parseDouble(strNum2);

                double sum = num1 + num2;
                double difference = num1 - num2;
                double product = num1 * num2;
                double quotient;

                if (num2 != 0) {
                    quotient = num1 / num2;
                    resultLabel.setText("Results: Sum=" + sum + ", Difference=" + difference + "\n Product=" + product + ", Quotient=" + quotient);
                } else {
                    resultLabel.setText("Cannot divide by zero. Please enter a non-zero second number.");
                }
            }
        });

        frame.setVisible(true);
    }
}
