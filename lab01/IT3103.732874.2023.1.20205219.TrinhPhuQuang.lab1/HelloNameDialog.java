import javax.swing.JOptionPane;

public class HelloNameDialog{
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        // input result variable from key board
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        //parentComponent = null, print "Hi", [what store in result] and "!"
        System.exit(0);
    }
}