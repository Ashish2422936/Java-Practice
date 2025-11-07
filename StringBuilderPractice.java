

class StringBuilderPractice{
    public static void main(String[] args) {
        String s1 = new String("Hello "); 
        // -> Hello World A new Object is created.
        StringBuffer s2 =new StringBuffer("Hello ");
        StringBuilder s3 = new StringBuilder("Hello ");

        System.out.println(s1.concat("World"));
        System.out.println(s2.append("World"));
        System.out.println(s3.append("World"));
        

    }
}