import java.util.*;
class Count_step
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.numberOfSteps(n);
        System.out.println(result + " steps to make "+ n + " as zero ");
    }
}
class Solution {
    public int numberOfSteps(int num) {
       int count=0;
       while(num!=0)
       {
            if(num%2==0)
            {
                num=num/2;
                count++;
            }
            else if(num%2==1)
            {
                num=num-1;
                count++;
            }
       } 
       return count;
    }
}