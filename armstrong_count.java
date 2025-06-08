//wap to find the count of an armstrong number in an array
import java.util.Scanner;
class armstrong_count
{
    public static boolean isArmstrong(int num)
    {
        int og = num;
        int len = String.valueOf(num).length();
        int sum=0;
        while (og > 0)
        {
            int d = og % 10;
            sum += Math.pow(d,len);
            og /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr=new int[size];
        for(int i =0;i<size;i++)
            arr[i] = scn.nextInt();
        int count=0;
        
        for(int i =0;i<size;i++)
        {
            if(isArmstrong(arr[i]))
                count++;
        }
        System.out.print(count);
        scn.close();
    }
}     