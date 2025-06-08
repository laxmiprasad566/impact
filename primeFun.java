//wac to check a number is prine or not using function
import java.util.Scanner;
class primeFun
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(prime(n));
        scn.close();
    }

    static boolean prime(int n)
    {
        int m = n/2;
        for(int i = 2;i<=m;i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}