import java.util.Scanner;
class evenodd
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr = new int[size];
        for(int ind = 0; ind < size; ind++)
            arr[ind] = scn.nextInt();
        even_odd(arr,size);
        scn.close();
    }

    static void even_odd(int[] a,int n)
    {
        int even= 0,odd=0;
        for(int val : a)
        {
            if (val%2 == 0)
                even++;
            else
                odd++;
        }
        System.out.printf("Even = %d Odd = %d",even,odd);
    }
}