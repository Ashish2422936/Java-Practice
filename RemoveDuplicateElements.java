import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        //First Method
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5));
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(al);
        ArrayList<Integer> al2 = new ArrayList<>(lhs);
        System.out.println(al2);

        //Second Method
        List<Integer> li =  al.stream().distinct().collect(Collectors.toList());
        System.out.println(li);
        List<Integer> li1 = al.stream().distinct().collect(Collectors.toList());

    }
}
