import javax.swing.JOptionPane;
public class ShowTwoNumbers{
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You have entered: "; //Noti for after enter number

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        // input for the first number
        strNotification += strNum1 + " and "; // Adding the first number to the notification

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        // input for the second number
        strNotification += strNum2; // Adding the second number to the notification

        // Displaying the notification message containing the entered numbers
        JOptionPane.showMessageDialog(null, strNotification);

        System.exit(0);
    }
}
