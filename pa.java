import java.util.Scanner;
class pa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for(int i = 1 ;i<=n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                if(c%2!=0)
                    System.out.print("*");
                else
                    System.out.print(" ");
                
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}