//WAC to rotate an array from the nth position
import java.util.Scanner;
class rev_nth_pos
{
    static void reverseNth(int[] arr,int n)
    {
        int left=0,right=n-1;
        while(left<right)
        {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }


    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr = new int[size];
        for(int ind = 0; ind < size; ind++)
            arr[ind] = scn.nextInt();
        System.out.println("Enter nth position");
        int n = scn.nextInt();
        reverseNth(arr,n);
        System.out.print("Reverser Array from nth position: ");
        for(int val:arr)
            System.out.print(val + " ");
        scn.close();

    }        
}