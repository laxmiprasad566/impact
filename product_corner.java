//wac to find the products od corners of 2d array
import java.util.*;

class product_corner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int m = scanner.nextInt();
        System.out.print("Enter the size columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int prod1=matrix[0][0] * matrix[0][n-1];
        int prod2=matrix[m-1][0]*matrix[m-1][n-1];
        int prod=prod1*prod2;
        System.out.print(prod);
        scanner.close();
    }
}
