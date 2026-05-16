abstract class Computer
{
    abstract void Mac();
}
class Macbook
{
    void Mac()
    {
        System.out.println("Macbook is running");
    }
}
class Abstract
{
    public static void main(String arg[])
    {
        Macbook m=new Macbook();
        m.Mac();
    }
}
