abstract class AbstractMethod{
    int a=2;
    abstract void method1();
    void method2(){
        System.out.println("Hello");
    }
    AbstractMethod(int a)
    {
        this.a = a;
        System.out.println("Contructor called " +a);
    }
    AbstractMethod(){
        System.out.println("Non-Param Constructor called");
    }
}
class Hello extends AbstractMethod{
    Hello()
    {
        super(10);
    }
    
    void method1(){
        System.out.println("Hello coming from method1");
    }
    void method2(){
        System.out.println(a);
    }
}

public class AbstractPTwo {
    public static void main(String[] args) {
        AbstractMethod a= new Hello();
        a.method1();
        a.method2();
    }
}
