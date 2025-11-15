import java.util.LinkedList;

class CollectionSecond{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(1,20);
        ll.addFirst(05);
        ll.addLast(30);
        System.out.println(ll);
        ll.removeFirst();
        
        System.out.println(ll);

    }
}