// import java.io.Serializable;
// import java.io.*;

// class Student_Data implements Serializable{
//     private int roll;
//     private String name;
//     private String dept;
//     private float marks;
//     public static int data = 10;
//     public transient int section_number;

//     public Student_Data()
//     {
//     }
//     public Student_Data(int r,String n,String d,float m,int da,int sn){
//         roll = r;
//         name = n;
//         dept = d;
//         marks = m;
//         data = da;
//         section_number = sn;
//     }
//     public String toString(){
//         return "\n Roll Number : " +roll + "\n Name : " +name +"\n Dept: " + dept +"\n Marks are : " +marks + "\nData which is static " +data + "\nSection which is Transient is : "+section_number;
//     }
// }

// public class SerialisationDemo {
//     // public static void main(String[] args) throws Exception{
//     //     Student_Data s= new Student_Data(41,"Ashish","ECE",8.29f,1,1);

//     //     FileOutputStream fos = new FileOutputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/Student1.txt");
//     //     ObjectOutputStream oos = new ObjectOutputStream(fos);

//     //     oos.writeObject(s);
//     //     fos.close();
//     //     oos.close();
//     // }
//     public static void main(String[] args) throws Exception{

//         FileInputStream fis = new FileInputStream("C:/Users/2422936/OneDrive - Cognizant/Desktop/Java Practice/Student1.txt");
//         ObjectInputStream ois = new ObjectInputStream(fis);

//         Student_Data s=(Student_Data)ois.readObject();

//         System.out.println(s);


//         fis.close();
//         ois.close();
//     }
// }
