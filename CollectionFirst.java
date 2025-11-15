import java.util.ArrayList;
 

class CollectionFirst{
    static void displayMax(int n)
    {
        if(n > 50)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();

        al.add(10);
        al.add(90);
        al.add(100);
        al.add(0,5);
        al.add(0,20);
        al.contains(3);
        al1.addAll(al);
        // al.set(0, 1);

        // Looping through ArrayList
        //1.For loop
        // for(int i=0;i<al.size();i++)
        // {
        //     System.out.print(al.get(i));
        // }
        // for(Integer x:al1)
        // {
        //     System.out.println(x);
        // }

        //2.Using Iterable 
        // Iterator<Integer> it = al.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //3.Using foreach
        // al.forEach(n->System.out.println(n));
        al1.forEach((n)->
        displayMax(n));


        // System.out.println(al);
        // System.out.println(al1);

    }
}