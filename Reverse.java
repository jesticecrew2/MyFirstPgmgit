import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args){
        int a,b,c=0;
        System.out.println("Enter the number");
        Scanner inputs=new Scanner(System.in);
        a=inputs.nextInt();
        while(a!=0)
        {
            b=a%10;
            c=c*10+b;
            a=a/10;
        }
    
    System.out.println("The reversed no"+c);
}
}