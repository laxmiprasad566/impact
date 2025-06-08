//water image
//wac to find mirror image od a 2d array
import java.util.*;
class water_image
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix=new int[m][n];
        for(int i = 0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Given matrix: \n");
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] wat_mat = new int[m][n];
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                wat_mat[i][j] = matrix[m-i-1][j];
            }
        }
        System.out.print("Water matrix: \n");
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(wat_mat[i][j] + " ");
            }
            System.out.println();
        }
    sc.close();
    }
}