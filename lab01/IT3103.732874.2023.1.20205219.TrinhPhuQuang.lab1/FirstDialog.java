import javax.swing.JOptionPane;
public class FirstDialog{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello world! How are you?");
        // parentComponent = null and the message itself
        System.exit(0);
    }
}