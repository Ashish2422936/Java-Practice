import java.util.StringTokenizer;

public class StringTokenizerPractice {
    public static void main(String[] args) {
        String data = "name=Ashish,city=hyd,emp_id=2422936,exp=0.6";
        StringTokenizer st = new StringTokenizer(data,"=,i");
        String s;
        while(st.hasMoreElements())
        {
            s=st.nextToken();
            System.out.println(s);
        }
    }
}
