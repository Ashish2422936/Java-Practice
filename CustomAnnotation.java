
@interface MyCustomAnnotation{
    String name();
    String date();
}

@MyCustomAnnotation(name="Ashish",date="05")
class CustomAnnotation{

    @MyCustomAnnotation(name="Ashish",date="05")
    public static void main(@MyCustomAnnotation(name="Ashish",date="05") String[] args) 
    {
        
    }
}