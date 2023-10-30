import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input number of rows and columns for matrices
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Create arrays for matrices and the result matrix
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        // Input elements for the first matrix
        System.out.println("Enter elements of the first matrix:");
        inputMatrixElements(input, matrix1, rows, cols);

        // Input elements for the second matrix
        System.out.println("Enter elements of the second matrix:");
        inputMatrixElements(input, matrix2, rows, cols);

        // Perform matrix addition
        addMatrices(matrix1, matrix2, resultMatrix, rows, cols);

        // Display the resultant matrix after addition
        displayMatrix(resultMatrix, rows, cols);

        input.close(); // Close the scanner
    }
    // Function to input matrix elements
    public static void inputMatrixElements(Scanner input, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
    }
    // Function to add two matrices
    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
    // Function to display the matrix
    public static void displayMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
