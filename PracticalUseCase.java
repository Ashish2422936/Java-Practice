import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PracticalUseCase {
    public static void main(String[] args) throws  Exception{
        FileInputStream fis = new FileInputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/MyText.txt.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);

        String str = new String(b);
        ArrayList<String> al = new ArrayList<>();

        StringTokenizer sT = new StringTokenizer(str," ");
//        "C:\Users\2422936\OneDrive - Cognizant\Desktop\Java Practice\MyText.txt.txt"

        while(sT.hasMoreElements())
        {
            al.add(sT.nextToken());
        }
        System.out.println(al);
    }
}
