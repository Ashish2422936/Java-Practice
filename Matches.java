import java.util.Scanner;

public class Matches {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int rev = n;
        int check = 0;
        // 250
        // digit = 0;
        // check = 0 + 0;
        // n = 25
        // digit = 5;
        // check = 0 + 5 = 5; 
        // n = 2

        // check = 50 + 2;

        while(n>0)
        {
            int digit = n%10;
            check = check*10 + digit;
            System.out.println(check);
            n/=10;
        }
        if(check==rev)
        {
            System.out.println("Pal");
        }
        else
        {
            System.out.println("Not a Pal");
        }
        sc.close();


    }
}
