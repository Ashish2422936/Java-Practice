import java.util.*;

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
        System.out.println(al3);

        al3.removeIf(num -> num%2!=0);
        System.out.println(al3);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Ashish","Anjali","Priya","King","King"));
        System.out.println(namesList);
        namesList.retainAll(Collections.singleton("King"));
        System.out.println(namesList);




    }
}
