//wap to find frequency of each character in a string
import java.util.*;
class freq
{
    public static void main(String[] args)
    {
        String str="hello world";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Character key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
    