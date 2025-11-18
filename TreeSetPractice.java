//import java.util.*;
//
//
//class MyClassHashSet implements Comparable<T>{
//    int x;
//    int y;
//
//
//    public MyClassHashSet(int xco,int yco){
//        x=xco;
//        y=yco;
//    }
//
//    @Override
//    public int compareTo(Object o)
//    {
//        MyClassHashSet p=(MyClassHashSet)o;
//        if (this.x < p.x) {
//            return -1;
//        }
//        else if(this.x > p.x)
//        {
//            return 1;
//        }
//        else{
//            if (this.y < p.y) {
//                return -1;
//            }
//            else if(this.y > p.y)
//            {
//                return 1;
//            }
//            else{
//                return 0;
//            }
//        }
//
//    }
//
//@Override
//public String toString() {
//    return "(" + x + "," + y + ")";
//}
//
//}
//
//
//class TreeSetPractice {
//    public static void main(String[] args) {
//        // Your code here
//        TreeSet<MyClassHashSet> ths = new TreeSet<>();
//        ths.add(new MyClassHashSet(4,2));
//        ths.add(new MyClassHashSet(0,1));
//        ths.add(new MyClassHashSet(1,4));
//        System.out.println(ths);
//    }
//}