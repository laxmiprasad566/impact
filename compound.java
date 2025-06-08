import java.util.Scanner;
class compound
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Principle");
        int p = scn.nextInt();
        System.out.print("rate");
        int r = scn.nextInt();
        System.out.print("Time");
        int t = scn.nextInt();
        double am=p;
        int month=1;
        while(month <= t)
        {
            am = am + (am * r/100);
            month++;
        }
        double intrest = am - p;
        System.out.printf("Interst: %.2f\n",intrest);
        System.out.printf("Amount: %.2f\n",am);
        scn.close();
    }
}