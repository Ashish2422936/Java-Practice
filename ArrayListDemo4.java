import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        //1.Compare them ? Sort them and compare ?
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));

        //2.Compare two Lists and Find the additional Elements
        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("Ashish","Bandana","Chandan","Dipak","Electro"));
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("Ashish","Bandana","Chandan","Dipak","Vam"));

        l3.removeAll(l4);
        System.out.println(l3);
        System.out.println(l4);

        //3.Find out the missing elements
        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("Ashish","Bandana","Chandan","Dipak","Electro"));
        ArrayList<String> l6 = new ArrayList<>(Arrays.asList("Ashish","Bandana","Chandan","Dipak","Vam"));
        l6.removeAll(l5);
        System.out.println(l6);

//        Find the common elements in l5 and l6.
        ArrayList<String> l7 = new ArrayList<>(Arrays.asList("Java","Python","C#","Go","Ruby"));
        ArrayList<String> l8 = new ArrayList<>(Arrays.asList("Java","Python","C#","Go","Swift"));
        l7.retainAll(l8);
        System.out.println("The common elements are : " +l7);




    }
}
