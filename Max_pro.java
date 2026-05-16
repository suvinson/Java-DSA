import java.util.*;
class Max_pro
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.maxProduct(num);
        System.out.println("Maximum product is : "+ result);
    }
}
class Solution {
    public int maxProduct(int n) {
        int arr[]=new int[10];
        int i=0;
        while(n!=0)
        {
            int rev=n%10;
            arr[i]=rev;
            n/=10;
            i++;
        }
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];
    }
}