@FunctionalInterface
interface MyLambdaExp {
    void show(); // Single abstract method — required

    // Default method — allowed
    default void display() {
        System.out.println("Hello from default method");
    }

    // Static method — allowed
    static void info() {
        System.out.println("Hello from static method");
    }
}

public class LambDemo {
    public static void main(String[] args) {
        // Lambda expression implementing the abstract method
        MyLambdaExp m = () -> System.out.println("Hello, coming from show method");

        m.show();       // Calls the lambda
        m.display();    // Calls the default method
        MyLambdaExp.info(); // Calls the static method
    }
}