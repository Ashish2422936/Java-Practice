// import java.util.*;
import java.util.ArrayDeque;

class ArrayDequePractice{
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // dq.add(1);
        // dq.add(2);
        // dq.addLast(3);

        // dq.removeFirst();

        //Using as Stack
        // dq.push(1);
        // dq.push(2);
        // dq.push(3);
        // dq.pop(); 
        // dq.removeFirst();

        //Using as stack
        dq.addFirst(1);
        dq.addLast(2);
        dq.add(3);
        dq.offer(1);
        dq.offerLast(2);
        dq.forEach((n)-> System.out.println(n));
    }
}