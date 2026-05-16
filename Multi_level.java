import java.util.*;
class Multi_level
{
    public static void main(String arg[])
    {
        Scanner scn= new Scanner(System.in);
        son s= new son();
        System.out.println(s.wealth + "$");
        s.disp();
        s.display();
    }
}
class grand_parent
{
    
    int wealth=1000000;
    void display(){
        System.out.println("So I am wealthy");
    }
}
class parent extends grand_parent
{
    
}
class son extends parent 
{
    void disp(){
        System.out.println("I have my Father's Asset");
    }
}