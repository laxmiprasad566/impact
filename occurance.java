//WAP to find check weather an element is present in an array or not.if it is find occurance of it.
import java.util.Scanner;
class occurance
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr=new int[size];
        for(int i =0;i<size;i++)
            arr[i] = scn.nextInt();
        System.out.println("Enter element: ");
        int ele=scn.nextInt();
        int count=0;
        for(int i =0;i<size;i++)
        {
            if(ele == arr[i])
                count++;
        }
        if (count == 0)
            System.out.print("Element is not found");
        else
            System.out.print(count);
        scn.close();
    }
}