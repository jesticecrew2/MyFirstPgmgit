class Bank{
int getInterest(){
    return 0;
}
}
class SBI extends Bank{
    int getInterest(){
        return 4;
}
}
class ICIC extends Bank{
    int getInterest(){
        return 5;
    }
    }
public class Polymorph{
    public static void main(String[] args){
    Bank ob;
    ob=new SBI();
    System.out.println("SBI Interest Rate");
    System.out.println(ob.getInterest());

    ob=new ICIC();
    System.out.println("ICIC Interest Rate");
    System.out.println(ob.getInterest());
    }
}