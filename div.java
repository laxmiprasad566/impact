import java.util.Scanner;
class div
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int num=scn.nextInt();
        if(num%3 == 0 && num%5 == 0)
            System.out.print("Div by 3 & 5");
        else if(num%3 == 0 && num%5 != 0)
            System.out.print("Div by 3 &  not5");
        else if(num%3 != 0 && num%5 == 0)
            System.out.print("Div by not 3 & but 5");
        else
            System.out.print("not Div by 3 & 5");
        scn.close();
    }
}