//wac to check weather a number is perfect square or not using a function
import java.util.Scanner;
class main{
    static boolean perfectSquare(int n)
    {
        int og = n;
        int sq = (int)Math.sqrt(og);
        return sq*sq == n;
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(perfectSquare(n));
        scn.close();
    }
}