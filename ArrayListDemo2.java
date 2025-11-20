import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> al1 =new ArrayList<>(Arrays.asList("Ashish","Vamsi","Anjali"));
        ArrayList<String> al2 =new ArrayList<>();
        ArrayList<String> clone = (ArrayList<String>)al1.clone();
//        System.out.println(clone);

        ArrayList<Integer> al3 = new ArrayList<>
                (Arrays.asList(1,2,3,4,5,6,1));
//        System.out.println(al3.contains(100));
//        System.out.println(al3.indexOf(4) > 0);
//        System.out.println(al3.getLast());
//        System.out.println(al3.lastIndexOf(1));
//        System.out.println(al3.remove(0));
//        System.out.println(al3);

        al3.removeIf(num -> num%2!=0);
//        System.out.println(al3);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Ashish","Anjali","Priya","King","King"));
//        System.out.println(namesList);
//        namesList.retainAll(Collections.singleton("King"));
//        System.out.println(namesList);

//        ArrayList<Integer> al5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
//        System.out.println(al5);
//        ArrayList<Integer> subNumbersList = new ArrayList<>(al5.subList(3, 6));
//        System.out.println(subNumbersList);

        //To covert an arrayList into Array
//        Object o[] = namesList.toArray();
//        for(Object x: o)
//        {
//            System.out.println((String)x);
//        }
//        String str[] = {"Ash","Vibha","Elve"};


        //To convert an Array to an ArrayListt
//        ArrayList<String> strAL = new ArrayList<>();
//        for(String x: str)
//        {
//            strAL.add(x);
//        }
//        System.out.println(strAL);
//

        //To convert an Array to an ArrayListt
//        ArrayList<String> als = new ArrayList<>(Arrays.asList(str));
//        System.out.println(als);


        //How to make an ArrayList Thread Safe ?
        //Ans : There are two ways of making arrayList Synchronised :
        // 1.By Using Collections.synchronisedList Method
        List<String> als = Collections.synchronizedList(new ArrayList<String>());

        //for adding we dont need explicit synchronisation
        als.add("Ashihs");

        //For traversing we need explicit synchronisation
        synchronized (als)
        {
            Iterator<String> it = als.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        // 2.CopyOnWriteArrayList class
        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
        cowal.add("Hi");
        cowal.add("How are you");
        System.out.println(cowal);



    }
}
