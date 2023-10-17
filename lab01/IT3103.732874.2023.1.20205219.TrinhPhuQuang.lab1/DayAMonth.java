import java.util.Scanner;
public class DayAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] monthNames = { "January", "February", "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"
        };
        String[] monthAbbreviations = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.",
                                        "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."
        };
        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        System.out.print("Enter a month (e.g., January, Jan., Jan, 1): ");
        String userInput = input.nextLine().toLowerCase();
        int month = -1;
        for (int i = 0; i < 12; i++) {
            if (userInput.equals(monthNames[i].toLowerCase()) ||
                    userInput.equals(monthAbbreviations[i].toLowerCase()) ||
                    userInput.equals(monthNames[i].substring(0, 3).toLowerCase()) ||
                    userInput.equals(String.valueOf(i + 1))) {
                month = i;
                break;
            }
        }
        if (month == -1) {
            System.out.println("Invalid month input. Please enter a valid month.");
            input.close();
            return;
        }
        System.out.print("Enter a year (e.g., 1999): ");
        int year = input.nextInt();
        if (year < 0) {
            System.out.println("Invalid year input. Please enter a non-negative year.");
        } else {
            if (isLeapYear(year) && month == 1) {
                System.out.println(monthNames[month] + " " + year + " has 29 days (leap year).");
            } else {
                System.out.println(monthNames[month] + " " + year + " has " + daysInMonth[month] + " days.");
            }
        }
        input.close();
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
