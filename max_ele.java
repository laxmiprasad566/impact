import java.util.Scanner;
class max_ele
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr=new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i =1;i<size;i++)
        {
            if(arr[i] > max)
                max=arr[i];
        }
        int sec_max = Integer.MIN_VALUE;
        
        for(int i = 0;i<size;i++)
        {
            if(max>arr[i] && sec_max<arr[i])
                sec_max=arr[i];
        }
        System.out.printf("second max :%d",sec_max);
        scn.close();
    }
}
/* 
        max= arr[0],sec_max=Integer.MIN_VALUE;
        for(i = 1;i<size;i++)
        {
        if(arr[i]>max){
        sec_max=max;
        max=arr[i];
        }
        else if(arr[i]!=max && arr[i]>sec_max)
        {
            sec_max=arr[i];
        }
        }
*/