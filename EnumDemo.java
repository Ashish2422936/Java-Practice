/**
 * @author Ashish
 * @version 2.9
 * @since 2025
 */

 /**
  * Class ENum
  */
enum Dept{
    CSE("Prabhas","Block A"),ECE("Ashish","Block A"),MECH("Ashish P","Block A"),IT("Ashu","Block A");
    String Location;
    String Name;
    private Dept(String Name,String Location){
        this.Location = Location;
        this.Name = Name;
    }
    /**
     * 
     */
    public void display(){
        System.out.println(this.Name + "'s Location is : " +Location );
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.CSE;
        System.out.println(d.Location);
        System.out.println(d.Name);
        d.display();
    }
    
}
