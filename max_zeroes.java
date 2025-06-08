//wac to print index of the row which has more no. zeros
import java.util.*;

class max_zeroes {
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
        int max_zeros = 0,index = -1;
        for (int i =0;i<m;i++)
        {
            int zeros=0;    
            {
                for(int j = 0;j<n;j++)
                {
                    if (matrix[i][j] == 0)
                        zeros++;
                }
                if(zeros>max_zeros)
                {
                    index = i;
                    max_zeros=zeros;
                }
            }
        }
        if(max_zeros != -1)
        System.out.printf("Max zeros are at index %d",index);
        else
        System.out.print("Zeroes are not found at any index.");
        scanner.close();
    }
}