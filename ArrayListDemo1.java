import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
//        int a[] = new int[4];
//        int i[] = {1,2,3,4} ;
//        int k[]={};
//        a[0] = 1 ;
//        a[1] =2;
//        a[2] =3;
////        a[4] = 4;
//        i[4] = 3;
//
//        System.out.println(a.length);
//        System.out.println(i.length);
//        System.out.println(k.length);
//        System.out.println(k[2]);

        ArrayList<Integer> al = new ArrayList<>(10);
        System.out.println(al.size());
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(1);
        System.out.println("Current size : " +al.size());

        ArrayList<String> als = new ArrayList<>();
        als.add("Ashish");
        als.add("Vamis");
        als.add("Prbahos");

        Iterator<String> its = als.iterator();

        while(its.hasNext())
        {
            System.out.println(its.next());
        }


        Iterator<Integer> it = al.iterator();

//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        //ForEach
//        al.forEach((e)-> System.out.println(e));

        //foreach loop
//        for(Integer x:al)
//        {
//            System.out.println(x);
//
//        }

        //Store the data in the ArrayList by constructor;
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,3,5,6,666,3));
        numbers.forEach((e)-> System.out.println(e));
        numbers.stream().forEach((e)-> System.out.println(e));
    }
}
