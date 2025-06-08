//WAC to find if the given set of elements are present in the 2d array or not
import java.util.Scanner;
class twoD_arr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row=sc.nextInt();
        System.out.print("Enter columns: ");
        int col=sc.nextInt();
        System.out.print("Enter elements: ");
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter key: ");
        int key=sc.nextInt();
        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<col;j++)
        //     {
        //         if (key == arr[i][j])
        //             System.out.print("key found!"); 
        //     }
        // }
        boolean found =false;
        for(int i= 0;i<row;i++)
        {
            if(arr[i][i] == key || arr[i][row-1-i]==key){
                found=true;
                break;
            }
        }
        if (found)
            System.out.print("Element is found at diagnol.");
        else
            System.out.print("Element is not found at diagnol.");
        sc.close();
    }
}