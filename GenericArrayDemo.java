@SuppressWarnings("unchecked")
public class GenericArrayDemo<T> {
    T[] myArray = (T[]) new Object[10];
    int length=0;
    public void append(T v){
        myArray[length++] = v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(myArray[i]);
        }
    }
    public static void main(String[] args) {
        GenericArrayDemo<Integer> gad = new GenericArrayDemo<>();
        gad.append(1);
        gad.append(2);
        gad.append(3);

        gad.display();
    }
}
