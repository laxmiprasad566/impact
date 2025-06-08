//WAC to code to find no. of constants and vowels in a string
import java.util.Scanner;
class ConsonentsVowels
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int c =0,v=0;
        for(int i =0;i< s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                v++;
            else
                c++;
        }
        System.out.print("vowels: " + v);
        System.out.print("\nconsonents: " + c);
        scn.close();
    }
}