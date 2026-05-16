import java.util.*;
class A_B
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        String str;
        System.out.println("Enter the string value with only a's and b's : ");
        str=scn.nextLine();
        Solution sol=new Solution();
        boolean result=sol.checkString(str);
        if(result)
        {
            System.out.println("The all b's are after the a's ");
        }
        else
            System.out.println("The all b's are not in after the a's ");

    }
}
class Solution {
    public boolean checkString(String s) {
        char[] arr=s.toCharArray();
            for(int  i=0;i<arr.length;i++)
            {
                for(int  j=i+1;j<arr.length;j++)
                {
                    if(arr[i]=='b' && arr[j]=='a')
                    {
                        return false;
                        
                    }
                }
            }
            return true;
    }
}