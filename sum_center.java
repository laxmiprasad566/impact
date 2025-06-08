//wac to print sum of center of edges
import java.util.*;

class sum_center {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int m = scanner.nextInt();
        System.out.print("Enter the size columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int cen_m=m/2;
        int cen_n=n/2;
        int sum1 = matrix[0][cen_n] + matrix[m-1][cen_n];
        int sum2 = matrix[cen_m][0] + matrix[cen_m][n-1];
        System.out.print(sum1 + sum2);
        scanner.close();
    }
} 