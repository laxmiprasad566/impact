import java.util.Scanner;
class zeroones
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr = new int[size];
        for(int ind = 0; ind < size; ind++)
            arr[ind] = scn.nextInt();
        count_zeros_ones(arr,size);
        scn.close();
    }

    static void count_zeros_ones(int[] a,int n)
    {
        int zc= 0,oc=0;
        for(int val : a)
        {
            if (val == 0)
                zc++;
            else
                oc++;
        }
        System.out.printf("zc = %d oc = %d",zc,oc);
    }
}