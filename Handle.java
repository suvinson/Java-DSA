import java.util.*;
class MarkScore extends Exception
{
    public MarkScore()
    {
        super("You're not eligible to vote ");
    }
}
public class Handle {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            System.out.println("Enter your age : ");
            int age = scn.nextInt();
            if(age <= 17)
            {
                throw new MarkScore();
            }
            else
            {
                System.out.println("You're eligible to vote ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
