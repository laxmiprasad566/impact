import java.util.*;
class bin_ser
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
        int left = 0,right = n-1;
        while(left <= right)
        {
            int mid=(left+right)/2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key)
                left = mid;
            else
                right = mid;
        }
        return -1;
    }
}