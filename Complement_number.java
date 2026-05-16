import java.util.*;
class Complement_number
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n=scn.nextInt();
        Solution sol = new Solution();
        int result = sol.findComplement(n);
        System.out.println("The complement of " + n + " is " + result);
    }
}
class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        char[] arr=binary.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                arr[i]='0';
            }
            else
                arr[i]='1';
        }
        String str = new String(arr);
        int number = Integer.parseInt(str,2);
        return number;
    }
}