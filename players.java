import java.util.Scanner;
class players
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int num = scn.nextInt();

        if(num == 1)
            System.out.print("Rahul");
        else if(num == 7)
            System.out.print("Dhoni");
        else
            System.out.print("Rohit");

        scn.close();
    }
}