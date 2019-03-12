class A{
    void wheelchair()
    {
        System.out.println("wheelchair");
    }
}
class B extends A{
    void car()
    {
        System.out.println("Audi car");
    }
}
class c extends B{
    void bike()
{
    System.out.println("ktm bike");
}    
}
public class multilevel
{
        public static void main(String[] args){
            c ob=new c();
            ob.wheelchair();
            ob.car();
            ob.bike();
        }
}