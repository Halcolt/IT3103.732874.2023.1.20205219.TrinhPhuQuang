package hust.soict.dsai.lab01;

import java.util.Scanner;
public class DayAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // declare scanner var

        // Arrays storing month names, days in month
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] monthAbbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.",
                "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Enter the month
        System.out.print("Enter a month (e.g., January, Jan., Jan, 1): ");
        String userInput = input.nextLine().toLowerCase();

        int month = -1; // Initialize the month to -1 (invalid value)
        for (int i = 0; i < 12; i++) {// Check the input of month names,
            if (userInput.equals(monthNames[i].toLowerCase()) ||
                    userInput.equals(monthAbbreviations[i].toLowerCase()) ||
                    userInput.equals(monthNames[i].substring(0, 3).toLowerCase()) ||
                    userInput.equals(String.valueOf(i + 1))) {
                month = i; // Store the valid month index
                break;
            }
        }
        // Handle invalid month input
        if (month == -1) {
            System.out.println("Invalid month input. Please enter a valid month.");
            input.close();
            return;
        }
        // enter a year
        System.out.print("Enter a year (e.g., 1999): ");
        int year = input.nextInt();

        // Check if the year is non-negative
        if (year < 0) {
            System.out.println("Invalid year input. Please enter a non-negative year.");
        } else {
            // Check if it's a leap year and print the number of days in the given month
            if (isLeapYear(year) && month == 1) {
                System.out.println(monthNames[month] + " " + year + " has 29 days (leap year).");
            } else {
                System.out.println(monthNames[month] + " " + year + " has " + daysInMonth[month] + " days.");
            }
        }
        input.close(); // Close the scanner
    }
    // check if it's a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
