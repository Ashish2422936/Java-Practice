import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

class StreamPractice{
    public static void main(String args[])
    {
    // FileInputStream fis = new FileInputStream("file location");
    // byte[] b = new byte[fis.available()];
    // fis.read();
    // String str  = new String(b);
    try(FileInputStream fis1=new FileInputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/test.txt");
    FileInputStream fis2=new FileInputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/test1.txt");
    FileOutputStream fos = new FileOutputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/Destination.txt");
    SequenceInputStream sis = new SequenceInputStream(fis1,fis2)
    )
    {
        
        int a;
        while((a=sis.read()) != -1){
            fos.write(a);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}