interface  Computer
{
    abstract void Mac();
}
interface  Computer_1
{
    abstract void Mac_1();
}
class Macbook implements Computer,Computer_1
{
   public  void Mac()
    {
        System.out.println("Macbook is running");
    }
    public void Mac_1()
    {
        System.out.println("Macbook Air is running");
    }
}
class Interface
{
    public static void main(String arg[])
    {
        Macbook m=new Macbook();
        m.Mac();
        m.Mac_1();
    }
}
