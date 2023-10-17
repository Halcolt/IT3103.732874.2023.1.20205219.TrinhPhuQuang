import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextDouble();
        }
        Arrays.sort(arr);
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        double average = sum / size;

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum of array : " + sum);
        System.out.println("Average of array : " + average);
        input.close();
    }
}
