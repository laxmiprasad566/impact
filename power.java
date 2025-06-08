//Find whether the given number is power of 2 or not.
import java.util.Scanner;
class power
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int num = scn.nextInt();
        int flag = 0;
        while(num > 2)
        {
                
                if (num % 2 == 1)
                {
                    flag = 1;
                    break;
                }
                else
                    num = num / 2;
        }
        if (flag == 0)
            System.out.print("Power of 2");
        else
            System.out.print("Not power of 2");
        scn.close();
    }
}