
import util.sscanf.Sscanf;

import javax.swing.*;

public class Equation {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null, "Type in your equation");
        Object[] inputs = Sscanf.scan(in, "%fx + %f = 0", '1', '2');
        for(Object input : inputs){
            System.out.print((String)input);
        }
        
    }


    private static String nSString = "This equation has no solution";
    private static String iSString = "This equation has infinite solution";
    /**
     * solve {ax + b = 0} equation  
     * @param a
     * @param b
     */
    public static void $1Degree1Var(double a, double b){
        if (a == 0 && b != 0){JOptionPane.showMessageDialog(null, nSString);}
        else if (a == 0 && b == 0){JOptionPane.showMessageDialog(null, iSString);}
        else{JOptionPane.showMessageDialog(null, "The solution is " + (-b / a));}
    }

    /**
     * solve {𝑎11𝑥1+𝑎12𝑥2=𝑏1 𝑎21𝑥1+𝑎22𝑥2=𝑏2} equation
     * @param a11
     * @param a12
     * @param b1
     * @param a21
     * @param a22
     * @param b2
     */
    public static void $1Degree2Var(double a11,double a12, double b1, double a21, double a22, double b2){
        if(a11/a21 == a12/a22){
            if (a11/a21 == b1/b2) JOptionPane.showMessageDialog(null, iSString + " : x1 = (" + b1 + " - " + a12 + "*x2)/" + a11 );
            else JOptionPane.showMessageDialog(null, nSString);
        }else{
            double $D = a11*a22 - a21*a12;
            double $D1 = b1*a22 - b2*a12;
            double $D2 = b2*a11 - b1*a21;
            JOptionPane.showMessageDialog(null, "The solution is : x = " + $D1/$D + " and y = " + $D2/$D);
        }
    }

    public static void $2Degree(double a, double b, double c){
        if (a == 0){$1Degree1Var(b, c);}
        else{
            double delta = b*b - 4*a*c;
            if (delta < 0){JOptionPane.showMessageDialog(null, nSString);}
            else if (delta == 0){JOptionPane.showMessageDialog(null, "The solution is x = " + (-b /(2*a)));}
            else {
                delta = Math.sqrt(delta);
                JOptionPane.showMessageDialog(null, "The solution is x1 = " + (-b + delta)/(2*a) + " and x2 = " + (-b - delta)/(2*a));
            }
        }
    }

}
