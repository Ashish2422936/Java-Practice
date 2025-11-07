

class Rectangle{
    private int length;
    private  int breadth;

    public int getLength()
    {
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int l)
    {
        length = l;
    }
    public void setBreadth(int b)
    {
        breadth = b;
    }

    public Rectangle()
    {
        length=1;
        breadth=1;
        System.out.println("Non-Parameterised Constructor of Rectangle is called....");
    }

    public Rectangle(int l,int b){
        length = l;
        breadth = b;
        System.out.println("Parameterised Constructor of Rectangle is called....");
    }
    public int area(){
        return length*breadth;
    }

}
     class Cuboid extends Rectangle{
        private int height;

        public Cuboid(){
            height=1;
            System.out.println("Non-Parameterised Constructor of Cuboid is called....");
        }
        public Cuboid(int l,int b,int h)
        {
            super();
            // setLength(l);
            // setBreadth(b);
            height = h;
            System.out.println("Parameterised Constructor of Cuboid is called....");
        }
        public int volume()
        {
            return getLength()*getBreadth()*height;
        }
    }   
public class SuperConstr {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(2,2,2);
        System.out.println("Area of Rectangle is :" + c.area());
        System.out.println("Volume of cuboid is :" + c.volume());
    }
}
 