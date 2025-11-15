import java.util.*;

class myClassHashSet{
    public static void main(String args[])
    {
        HashSet<Integer> hs=new HashSet<>(10);
        hs.add(10);
        hs.add(20);
        hs.add(30);

        System.out.println(hs);
    }
}