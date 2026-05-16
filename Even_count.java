import java.util.*;
class Even_count
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution ();
        int result=sol.findNumbers(arr);
        System.out.println("There are "+result+"  even numbers.");
    }
}
class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
           int n=nums[i];
           int num=String.valueOf(n).length();
           if(num%2==0)
           {
                count++;
           }
        }
        return count;
    }
}