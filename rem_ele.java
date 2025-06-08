//wac to remove all the elements from a hashset which is present in an arrray
import java.util.*;
class rem_ele
{
    public static void main(String[] args)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        int[] rem_arr={2,6,7};
        for(int i =0;i<rem_arr.length;i++)
        {
            if(set.contains(rem_arr[i]))
                set.remove(rem_arr[i]);
        }
        System.out.println("Updated set: "+set);
    }
}