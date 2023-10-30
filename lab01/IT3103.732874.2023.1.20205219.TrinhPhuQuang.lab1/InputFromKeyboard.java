import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String agrs[]) {
        Scanner keyboard = new Scanner(System.in);// keyboard is var to read data from keyboard

        System.out.println("What's your name?");
        String strName = keyboard.nextLine();// input name then go to nextline
        System.out.print("How old are you? ");
        int iAge = keyboard.nextInt();// input Age then go to nextline
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();// input height then go to nextline
        //similar to other data types
        //nextByte(), nextShort(), nextLong()
        //nextFloat(), nextBoolean()

        System.out.println("Mrs/Ms." + strName + "," + iAge + " years old. "
                + "Your height is " + dHeight + "."); // print all infomation
    }
}