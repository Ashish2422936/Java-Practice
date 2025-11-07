public class Meth {
    static String findUserName(String email)
    {
        int indexofA = email.indexOf("@");
        String userName = email.substring(0, indexofA);
        return userName;
    }
    public static void main(String[] args) {
        String email = "Ashish@gmail.com";
        String userName = findUserName(email);
        System.out.println("The name is : " +userName);
    }
}
