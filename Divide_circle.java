import java.util.*;
class Divide_circle
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number of pieces you want in a circle: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.numberOfCuts(num);
        System.out.println("The minimum cuts to split the circle is : "+result);
    }
}
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
            return 0;
        if(n%2==0)
        {
            return n/2;
        }
        else 
            return n;
    }
}