import java.util.*;
class Poweroffour{
    //16=4^2
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isPowerOfFour(num);
        if(result)
            System.out.println(num + " It is a power of four");
        else
            System.out.println(num + " It is not a power of four");
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        while(n>1)
        {
            if(n%4!=0)
               return false;
            n=n/4;
        }
        return true;
    }
}