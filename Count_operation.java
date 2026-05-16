import java.util.*;
class Count_operation
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the first number: ");
        n1=scn.nextInt();
        System.out.println("Enter the second number: ");
        n2=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.countOperations(n1,n2);
        System.out.println("Total count is: "+result);
    }
}
/*
For example, if num1 = 5 and num2 = 4, 
subtract num2 from num1,
thus obtaining num1 = 1 and num2 = 4. However, 
if num1 = 4 and num2 = 5,
after one operation, 
num1 = 4 and num2 = 1.
*/
class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
        while(num1!=0 && num2!=0)
        {
            if(num1>num2)
            {
                num1=num1-num2;
            }
            else 
                num2=num2-num1;
            count++;
        }
            return count;
    }
}