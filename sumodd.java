//Write a program to accept an integer N and print the sum of first N odd numbers
import java.util.Scanner;
class sumodd
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++)
        {
            if(i % 2 != 0)
            {
                sum = sum + i;
            }
        }
        System.out.print(sum);
        scn.close();
    }
}