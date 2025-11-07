interface myLam{
    void display();
}
class CallLambda{
    public void callLambdaFunction(myLam ml)
    {
        ml.display();
    }
}
class MyLambdaClass
{
    public void method1()
    {
        // int x = 1;
        // myLam m = () ->{
        //     System.out.println("Coming from display method using Lambda Expression");
        //     f=f+1;
        //     // x=f+1; // WE cant change the final variable
        // };
        // m.display();
        CallLambda cl = new CallLambda();
        cl.callLambdaFunction(()->{System.out.println("Coming from the Lambda Expression");});
    }
}

class myLambdaExp{
    public static void main(String args[])
    {
        MyLambdaClass mlc = new MyLambdaClass();
        mlc.method1();
    }
}