import java.util.HashMap;
import java.util.Iterator;
//import java.util.map.Entry;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        //No Ordering and No Indexing

        hmap.put("IND","Ashish");
        hmap.put("AUS","Smith");
        hmap.put("SL","Pathirana");

        //Keys Cannnot be duplicate
        hmap.put("IND","Virat");

        //Can store multiple null values but ony one null key
        hmap.put(null ,"Nag");
        hmap.put(null,"Mukul");
        hmap.put("WL",null);
        hmap.put("AU",null);
        hmap.remove(null);

        System.out.println(hmap);
        System.out.println(hmap.get("WL"));
        System.out.println(hmap.get("LA"));
        System.out.println(hmap.get(null));

        //Iterating in a hashmap
        //Using Iterator -> keySet
        Iterator<String> it = hmap.keySet().iterator();

        while(it.hasNext())
        {
            String key = it.next();
            String value = hmap.get(key);
            System.out.println("The key is : " +key+ " ,The value is : " +value);
        }

        System.out.println("------------------------------------------------");

        //Using EntrySet (Pair)
        Iterator<Entry<String,String>> iter = hmap.entrySet().iterator();

        while(iter.hasNext())
        {
            Entry<String,String> en = iter.next();
            System.out.println(en.getKey() +" " +en.getValue());
        }

        //Iterating using for each and Lambda Expression
        hmap.forEach((k,v)-> System.out.println("The Key in the HashMap is : " +k+ " Value is : " +v));


    }
}
