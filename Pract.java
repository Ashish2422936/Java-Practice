public class Pract {
    public static void main(String[] args) {
        String a = "Ashish";
        String b = "Ashish";
        String c = new String("Ashish");

        System.out.println(a == b); // true

        System.out.println(a.equals(b)); // true

        System.out.println(a.equals(c)); // true

        System.out.println(a == c); // false
        
    }
}
