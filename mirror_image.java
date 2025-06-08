//wac to find mirror image od a 2d array
import java.util.*;
class mirror_image
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
        int[][] mir_mat = new int[m][n];
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                mir_mat[i][j] = matrix[i][n-j-1];
            }
        }
        System.out.print("Mirror matrix: \n");
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(mir_mat[i][j] + " ");
            }
            System.out.println();
        }
    sc.close();
    }
}