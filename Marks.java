import java.util.*;
class Markscore extends Exception
{
    public Markscore()
    {
        super ("Marks cannot be below 75!");
    }
}
class Marks
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        try
        {
            System.out.println("Enter the marks scored: ");
            int marks= scn.nextInt();
            if(marks<75)
            {
                throw new Markscore();
            }
            else
                System.out.println("Mark is eligible to apply for college");
        }
            catch(Markscore e)
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                scn.close();
            }
    }
}