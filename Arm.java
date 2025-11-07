import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int sum = num;
        int check_num=0;
        while (num>0) 
        {
            int digit = num % 10;
            check_num = check_num + digit*digit*digit;
            num/=10;
        }
        if(check_num==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
