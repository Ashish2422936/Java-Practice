
interface MyInterface{
    void show(String name);
}
// class My implements MyInterface{
    
//     public void show(){
//         System.out.println("Hello Coming from the my class");
//     }
// }

class AnnonymsDemo{
    public static void main(String args[])
    {
        MyInterface my = (s) ->{
            System.out.println("Hey This Line -> "+s +"  (Hello coming from show method) ");
        };
        my.show("Ashish");
    }
}