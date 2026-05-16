import java.util.*;
class Powerofthree{
    //27=3^3
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isPowerOfThree(num);
        if(result)
            System.out.println(num + " It is a power of three");
        else
            System.out.println(num + " It is not a power of three");
    }
}
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        while(n>1)
        {
            if(n%3!=0)
               return false;
            n=n/3;
        }
        return true;
    }
}