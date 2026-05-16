import java.util.*;
class Name{
    public static void main(String args[])
    {
        System.out.print("Enter your name: ");
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        System.out.print("Enter your age: ");
        int b=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your address: ");
        String c=scan.nextLine();
        System.out.println("Your name: "+a);
        System.out.println("Your age : "+b);
        System.out.print("Your address: "+c);
    }
}