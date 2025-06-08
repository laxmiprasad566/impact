//WAC to find length of a string without using any function
import java.util.Scanner;
class StringLength
{
    public static void main(String[] args)
    {
        String str = "String";
        int c = 0;
        for(int i =0; str.charAt(i) != "NULL";i++)
            c++;
        System.out.print(c);
    }
}
