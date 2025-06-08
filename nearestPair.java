import java.util.Scanner;
import java.util.Arrays;
class nearestPair
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int[] arr = {5,8,3,9,10,15};
        Arrays.sort(arr);
        int a=0,b=0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0;i < arr.length - 1;i++)
        {
            int sub = arr[i+1]-arr[i];
            if(diff > sub)
            {
                diff = sub;
                a=arr[i];
                b=arr[i+1];
            }
        }
        System.out.print(a + " ");
         System.out.print(b);
         scn.close();
    }
}