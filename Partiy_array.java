import java.util.*;
class Partiy_array
{
    public static void main(String arg[])
    {
        Scanner scn= new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array values : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        boolean result=sol.uniformArray(arr);
        System.out.println(result);
    }
}
class Solution {
    public boolean uniformArray(int[] nums1) {
        int count=0;
        int arr[]=new int[nums1.length];
        if(nums1.length==1)
            if(nums1[0]%2==1)
                return true;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0)
            {
                count++;
            }
            else if(nums1[i]%2==1)
            {
                arr[i]=nums1[0]-nums1[1];
                arr[1]=nums1[1];
                count++;
            }
        }
        if(count==nums1.length)
            return true;
        else 
            return false;
       
        
    }
}