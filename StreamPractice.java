import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class StreamPractice{
    public static void main(String args[])
    {
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice");
        String str = " Hey Ashish,updating the text file";

        fos.write(str.getBytes());
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}