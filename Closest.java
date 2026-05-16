import java.util.*;
class Closest
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the first person distance: ");
        x=scn.nextInt();
        System.out.println("Enter the second person distance: ");
        y=scn.nextInt();
        System.out.println("Enter the third person distance: ");
        z=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.findClosest(x,y,z);
        System.out.println(result);
    }
}
class Solution {
    public int findClosest(int x, int y, int z) {
        
        int count=0,sum=0;
        if(x>z)
            count=x-z;
        else 
            count=z-x;
        if(y>z)
            sum=y-z;
        else
            sum=z-y;
        if(count<sum)
            return 1;
        else if(sum<count)
            return 2;
        return 0;

    }
}