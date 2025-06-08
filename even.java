//Given a start and end value , print the even numbers from start till end.

import java.util.Scanner;
class even
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int start = scn.nextInt();
        int end = scn.nextInt();
        for(int i = start;i<=end;i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        scn.close();
    }
}