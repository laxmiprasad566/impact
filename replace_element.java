import java.util.Scanner;
class replace_element
{
    static void replace_ele(long[] arr,int size)
    {
        long sum=0;
        for(long val:arr)
            sum += val;
        
        for(int i=0;i<size;i++)
        {
            arr[i]=sum-arr[i];
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();
        long[] arr=new long[size];
        for(int i = 0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }
        replace_ele(arr,size);

        for(long val:arr)
            System.out.print(val + " ");
        
        scn.close();
    }
}