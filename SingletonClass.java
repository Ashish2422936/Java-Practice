class Singleton{
private static Singleton single_instance = null;

    private Singleton(){
        System.out.println("Constructor called");
    }

    public static Singleton getInstance(){
        if(single_instance == null)
        {
            single_instance = new Singleton();
        }
        return single_instance;
    }
    public static void printInstance() {
        System.out.println("Current instance: " + single_instance);
    }
}

public class SingletonClass{
    
    public static void main(String args[])
{
    Singleton.printInstance();
    Singleton s1 = Singleton.getInstance();
    System.out.println("after first call : " +s1);
    Singleton s2 = Singleton.getInstance();
    System.out.println("after second call : " +s1);
    System.out.println("Are both same? " + (s1 == s2));
}
}