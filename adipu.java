import java.util.Scanner;
class adipu
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //String s = "ADIPU";
        String s=sc.nextLine();
        for(int i = 0;i<s.length();i++)
        {
            for(int j = 0;j<=i;j++)
            {
                char c=s.charAt(j);
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println();
            sc.close();
        }
    }
}