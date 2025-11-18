import java.io.FileOutputStream;
import java.util.Properties;
// import java.io.*;

class PropertyDemo{
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        p.setProperty("name", "Ashish");
        p.setProperty("age", "24");
        p.setProperty("Emp_Id", "2422936");
        p.storeToXML(new FileOutputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/myProperties.xml"), "Details");
    }
}