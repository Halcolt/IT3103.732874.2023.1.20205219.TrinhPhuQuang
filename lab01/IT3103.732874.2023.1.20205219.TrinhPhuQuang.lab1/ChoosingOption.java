//import javax.swing.JOptionPane;
//public class ChoosingOption{
//    public static void main(String[] args){
//        //add pannel for asking question
//        int option = JOptionPane.showConfirmDialog(null,
//            "Do you want to change to the first class ticket?");
//
//        //Show the chosen answer, yes or no, cancel = no
//        JOptionPane. showMessageDialog(null , "You 've chosen:"
//        + (option==JOptionPane. YES_OPTION?"Yes":"No"));
//        System. exit(0) ;
//        }
//}

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showOptionDialog(
                null,
                "Do you want to change to the first class ticket?",
                null,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Yes", "No"},
                null
        );

        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
