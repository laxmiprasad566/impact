import java.util.*;
class mat_pat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int c = 0;
        for(int i =0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i%2 == 0)
                    System.out.print(matrix[i][j] + " ");
                if(i%2 != 0&& c%2 ==0 && j < n-1)
                    System.out.print("  ");
                if(i % 2 != 0 && c%2 == 0 && j==n-1){
                    System.out.print(matrix[i][j]);
                     c++;
                    break;}
                if(i % 2 != 0 &&c%2==1 && j==0){
                    System.out.print(matrix[i][j]);
                    c++;
                break;}
            }
            System.out.println();
            
            
        }
        sc.close();
    }
}