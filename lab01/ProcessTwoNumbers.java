

import javax.swing.JOptionPane;

public class ProcessTwoNumbers{
    public static void main(String[] args) {
        String strNum1,strNum2;
        String strCalType;
        double intNum1,intNum2;

        while (true){
            try{
                strNum1 = JOptionPane.showInputDialog(null, 
                    "Please input the first number: ",
                    "Input the first number",JOptionPane.INFORMATION_MESSAGE);
                intNum1 = Double.parseDouble(strNum1);
            
            
            }catch(Exception e){
                continue;
            }
            break;
        }
        
        while (true){
            try{
                strNum2 = JOptionPane.showInputDialog(null, 
                    "Please input the second number: ",
                    "Input the second number",JOptionPane.INFORMATION_MESSAGE);
                intNum2 = Double.parseDouble(strNum2);    
            }catch(Exception e){
                continue;
            }
            break;
        }

        

        outerloop:
        while (true){
            strCalType = JOptionPane.showInputDialog(null, 
                "Please input the calculation option (sum, difference, product, quotient): ", 
                "Input the calculation option",JOptionPane.INFORMATION_MESSAGE);

            switch (strCalType) {
                case "sum":
                    JOptionPane.showMessageDialog(null, "Sum of " + strNum1 + " and " + strNum2 
                        + " is " + (intNum1 + intNum2));
                    break outerloop;
            
                case "difference":
                    JOptionPane.showMessageDialog(null, "Difference of " + strNum1 + " and " + strNum2 
                        + " is " + (intNum1 - intNum2));
                    break outerloop;

                case "product":
                    JOptionPane.showMessageDialog(null, "Product of " + strNum1 + " and " + strNum2 
                        + " is " + (intNum1 * intNum2));
                    break outerloop;

                case "quotient":
                    if (intNum2 == 0){
                        JOptionPane.showMessageDialog(null, "The caculation is invalid, divisor is equal 0");
                    } else
                    JOptionPane.showMessageDialog(null, "Quotient of " + strNum1 + " and " + strNum2 
                        + " is " + (intNum1 / intNum2));
                    break outerloop;

                default:
                    JOptionPane.showMessageDialog(null, "Please enter valid option ");
                    break;
            }
        }

        System.exit(0);
    }
    //public static double sum{
        
    //}
}