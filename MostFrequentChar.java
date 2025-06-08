//WAC to find most frequent character in a string
import java.util.Scanner;

class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();

        int[] freq = new int[256]; 
        char mostFreqChar = ' ';
        int maxFreq = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            freq[ch]++;

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFreqChar = ch;
            }
        }

        System.out.println("Most frequent character: " + mostFreqChar);
        System.out.println("Frequency: " + maxFreq);
        scn.close();
    }
}
