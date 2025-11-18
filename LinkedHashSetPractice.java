import java.util.*;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("B");
        lhs.add("D");
        lhs.add("A");
        lhs.add("B");

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(0, "B");
        lhm.put(1, "D");
        lhm.put(2, "A");
        lhm.put(3,"B");

        //Iterate(Displaying) -> LinkedHashSet
        Iterator<String> it=lhs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Iterate(dis) -> LinkedHashMap
        lhm.forEach((k,v)->System.out.println(k+ " " +v));
        


        //HashTable
        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1,"Hello");
        ht.put(2, "World");

        String s=(String)ht.get(2);
        System.out.println(s);


    }
}
