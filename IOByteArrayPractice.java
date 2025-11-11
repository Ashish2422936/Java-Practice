import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;

class IOByteArrayPractice{
    public static void main(String[] args) throws Exception{
        byte[] b ={'a','s','h','i','s','h'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // int x;
        // while((x=bis.read()) != -1)
        // {
        //     System.out.print((char)x);
        // }
        char[] c = {'a','s','h'};
        CharArrayReader car = new CharArrayReader(c);
        int x;
        while((x=car.read()) != -1)
        {
            System.out.println((char)x);
        }
    }
}