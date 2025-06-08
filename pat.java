import java.util.Scanner;
class pat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i = 1 ;i<=n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                // if(c%2==0)
                //     System.out.print("0 ");
                // else
                //     System.out.print("1 ");
                System.out.print(c%2+" ");
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}