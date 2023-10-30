import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //var to store data from keyboard

        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();// enter the height of the triangle
        // Loop to create the triangle
        for (int i = 1; i <= height; i++) {
            // Loop for leading spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); // Print spaces based on row number
            }
            // Loop to print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Print stars based on row number
            }
            System.out.println(); // Move to the next line for the next row
        }
        input.close(); // Close the scanner
    }
}
