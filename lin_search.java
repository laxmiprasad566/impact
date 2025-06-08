import java.util.Scanner;
class lin_search
{
    static int linear_search(int[] arr,int size,int key)
    {
        for(int i = 0;i<size;i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr = new int[size];
        for(int ind = 0; ind < size; ind++)
            arr[ind] = scn.nextInt();
        System.out.println("Enter key");
        int key=scn.nextInt();

        int index=linear_search(arr,size,key);
        if (index > 0) 
            System.out.printf("Found at Index: %d",index);
        else
            System.out.print("Element not found");
        scn.close();
    }
}           