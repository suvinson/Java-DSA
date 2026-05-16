import java.util.*;
class Addtwointeger{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number:");
        num1=scn.nextInt();
        System.out.println("Enter the second number:");
        num2=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.sum(num1,num2);
        System.out.println("Sum of two numbers: "+result);
    }
}
class Solution {
    public int sum(int num1, int num2) {
        return num1+num2;
    }
}