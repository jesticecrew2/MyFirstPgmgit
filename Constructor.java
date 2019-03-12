public class Constructor
{
    int a;
    Constructor()
    {
        a=100;
    
    }
    public static void main(String[] args)
    {
        Constructor ob=new Constructor();
        System.out.println(ob.a);
    }
}