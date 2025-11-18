import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

class TreeMapPractice{
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(2,"H" ,3,"I"));
        tm.put(0,"A" );
        tm.put(1, "S");

        //First Entry
        Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e.getValue());


        //Displaying all the elements ->
        tm.forEach((k,v)->System.out.println("The Key is : " + k +" The Value is : " + v));

        //LinkedHashMap
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);
        lhm.put(1,"S");
        lhm.put(0,"A");
        lhm.put(2,"H");
        lhm.put(3,"I");

        //Displaying the elements
        lhm.forEach((k,v)->System.out.println("The Key is : " + k +" The Value is : " + v));


        // So the basic difference between HashMap and LinkedHashMap is that LinkedHashMap(Used for Caching)
        // maintains the order but the hashmap gives the sorted order
        
    }
}