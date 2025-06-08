import java.util.*;
class max_val_hash
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",40);
        map.put("D",80);
        map.put("E",30);
        String maxKey=null;
        int maxval=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>maxval)
            {
                maxval=entry.getValue();
                maxKey=entry.getKey();
            }
        }
        System.out.println("Key with max value "+maxKey+" (Value : "+maxval+")");
    }
}