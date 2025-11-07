public class Rect {
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }

    public void setLength(double l){
        if(l>0)
        {
            length = l;
        }
        else
        {
            length= 0;
        }
    }

    public double getBreadth(){
        return breadth;
    }

    public void setBreadth(double b)
    {
        if(b>0)
        {
            breadth = b;
        }
        else
        {
            breadth= 0;
        }
    }

    public double area(){
        return length*breadth;
    }

    public double Perimeter()
    {
        return 2.0 * (length+breadth);
    }
    public boolean isSquare()
    {
        return length==breadth?true:false;
    }
    public static void main(String[] args) {
        Rect r = new Rect();
        r.setLength(2.0);
        r.setBreadth(2.0);

        System.out.println(r.area());
        System.out.println(r.Perimeter());
        System.out.println(r.isSquare());
    }
}
