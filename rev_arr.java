import java.util.Scanner;
class rev_arr
{
    static void reverse_arr(int[] arr,int size)
    {
        int left=0,right=size-1;
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
        reverse_arr(arr,size);
        System.out.print("Reverser Array: ");
        for(int val:arr)
            System.out.print(val + " ");
        scn.close();
    }
}