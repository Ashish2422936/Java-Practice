abstract class Shape{
    abstract void area();
    abstract void perimeter();
}
class Rectangle extends Shape{
    int length = 2;
    int breadth = 2;
    @Override
    public void area(){
        System.out.println("Area of Rectangle is : " +length*breadth);
    }
    public void perimeter(){
        System.out.println("Perimeter of an Rectangle : " + 2*(length+breadth));
    }
}
class Circle extends Shape{
    int radius = 3;
    @Override
    public void area(){
        System.out.println("Area of Circle is : " + (radius*radius));
    }
    @Override 
    public void perimeter(){
        System.out.println("Perimeter of an Circle : " + 2*(radius));
    }
}


class AbstractPractice{
    public static void main(String[] args) {
        Shape sp = new Rectangle();
        sp.area();
        sp.perimeter();
        Shape sp1 = new Circle();
        sp1.area();
        sp1.perimeter();

    }
}