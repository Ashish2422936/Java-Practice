import java.io.*;

class Student{
    int roll_number;
    String name;
    String dept;
}

class Pract2{
    public static void main(String[] args) throws Exception {
        Student sIn = new Student();

        //Saving the object in a file.
        // s.roll_number = 10;
        // s.name = "Ashish";
        // s.dept = "ECE";

        // FileOutputStream fos = new FileOutputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/MyText.txt");
        // DataOutputStream dos = new DataOutputStream(fos);

        // dos.writeInt(s.roll_number);
        // dos.writeUTF(s.name);
        // dos.writeUTF(s.dept);

        // fos.close();
        // dos.close();

        //Getting the onject which was saved in the file
        FileInputStream fis = new FileInputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/MyText.txt");
        DataInputStream dos = new DataInputStream(fis);
        // BufferedReader bis = new BufferedReader(new InputStreamReader(fis));

        sIn.roll_number = dos.readInt();
        sIn.name = dos.readUTF();
        sIn.dept = dos.readUTF();

        System.out.println("THe details are " + sIn.name + "Roll : " + sIn.roll_number + sIn.dept);
 
        fis.close();
        dos.close();



    }
}