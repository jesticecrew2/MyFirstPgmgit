import java.util.Scanner;
public class Addpgm{
    public static void name(String[] args) {
        java.util.Scanner myinput=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st Number");
        a=myinput.nextInt();
        System.out.println("Enter 2nd Number");
        b=myinput.nextInt();
        c=a+b;
        System.out.println("Sum"+c);
    }
}