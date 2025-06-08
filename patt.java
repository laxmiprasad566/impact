import java.util.Scanner;
class patt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int s=1;
        for(int i = 1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int k=s;k<s+i;k++)
                System.out.print(k);
            for(int l=(i-1)*2;l>=i;l--)
                System.out.print(l);
            System.out.println();
            s++;
        }
        sc.close();
    }
}