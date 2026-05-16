//Minimum common value
import java.util.*;
class Mcv
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n=scn.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the first array values: ");
        for(int i=0;i<n;i++)
        {
            arr1[i]=scn.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int n1=scn.nextInt();
        int arr2[]=new int[n1];
        System.out.println("Enter the second array values: ");
        for(int i=0;i<n1;i++)
        {
            arr2[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result=sol.getCommon(arr1,arr2);
        System.out.println("The minimum common value is: "+result);
    }
}
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int j = 0;   

        for(int i = 0; i < nums1.length && j < nums2.length; i++)
         {

            while(j < nums2.length && nums2[j] < nums1[i]) 
            {
                j++;      
            }

            if(j < nums2.length && nums1[i] == nums2[j])
             {
                return nums1[i];
            }
        }

        return -1;
    }
}