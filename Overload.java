class Overload{

    static int add(int a,int b)
    {
        System.out.println("Method having 2 parameters as integers are being called");
        return a+b;
    }
    static double add(double a,double b)
    {
        System.out.println("Method where 2 parameters are double");
        return a+b;
    }
    static double add(int a,double b)
    {
        System.out.println("Method where 1 parameter is int and another paramete is double");
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(1,1));
        System.out.println(add(1.1,1.1));
        System.out.println(add(2,1.1));
    }
}