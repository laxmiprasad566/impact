import java.util.Scanner;
class arr
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scn.nextInt();
        int[] a = new int[size];
        for(int i = 0; i < size; i++)
            a[i]= scn.nextInt();
        
        for(int j = size-1;j >= 0; j-- )
            System.out.print(a[j]+" ");

        System.out.println();

        for(int i = 0; i < size; i++)
            System.out.print(a[size-1-i]+" ");   
             
        scn.close();
    }
}