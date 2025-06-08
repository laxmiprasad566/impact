import java.util.Scanner;

class LowerToUpperManual {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String input = scn.nextLine();

        char[] result = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result[i] = (char)(ch - 32);  
            } else {
                result[i] = ch;  
            }
        }

        System.out.println("Uppercase string: " + new String(result));
        scn.close();
    }
}
