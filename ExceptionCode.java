import java.util.*;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}
public class ExceptionCode {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            System.out.println("Enter your age  : ");
            int age = scn.nextInt();
            
            checkAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Voting Exception: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error: Please enter a valid integer numeric age.");
        }
        finally 
        {
            System.out.println("The code executed");
        }
    }
    public static void checkAge(int age) throws InvalidAgeException
    {
        if( age < 18)
        {
            throw new InvalidAgeException("Age " + age + " is too young. You must be 18 or older to vote.");
        }
        else
        {
            System.out.println("You are eligible to vote : ");
        }
    }
}
