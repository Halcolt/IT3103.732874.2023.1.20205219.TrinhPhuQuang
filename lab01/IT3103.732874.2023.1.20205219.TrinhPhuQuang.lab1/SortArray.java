import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt(); // enter size of array
        double[] arr = new double[size];
        //input all element of array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextDouble();
        }
        Arrays.sort(arr);//sort array
        double sum = 0;// var for sum of array
        for (double num : arr) {//calculate sum of array
            sum += num;
        }
        double average = sum / size;//calculate average of array

        //print infomation
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum of array : " + sum);
        System.out.println("Average of array : " + average);
        input.close();
    }
}
