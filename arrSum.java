import java.util.Scanner;
class arrSum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        sum(n);
        scn.close();
    }
    static void sum(int n)
    {
        int size = n;
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<size;i++)
        {
            int sum = 0;
            for(int j =i+1;j<size;j++) {
                sum += arr[j];
            }    
            System.out.print(sum + " ");
        }
    }
}