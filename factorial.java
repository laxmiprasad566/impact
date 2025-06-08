//wac using function to calcualte a factorial 
import java.util.Scanner;
class factorial
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(fact(n));
        scn.close();
    }

    static int fact(int n)
    {
        int og=1;
        for(int i = n;i>=1;i--)
            og *= i;
        return og;
    }
}