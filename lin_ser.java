import java.util.*;
class lin_ser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter key: ");
        int key=sc.nextInt();
        int ind = pos_key(arr,size,key);
        System.out.print("Key is at index "+ind);
        sc.close();
    }
    static int pos_key(int[] arr,int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
}