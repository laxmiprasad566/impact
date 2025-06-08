//code to print lowest key in hashmap
import java.util.*;
class min_val_hash
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",40);
        map.put("D",80);
        map.put("E",30);
        String minKey=null;
        int minval=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer>entry:map.entrySet())
        {
            if(entry.getValue()<minval)
            {
                minval=entry.getValue();
                minKey=entry.getKey();
            }
        }
        System.out.println("Key with min value "+minKey+" (Value : "+minval+")");
    }
}