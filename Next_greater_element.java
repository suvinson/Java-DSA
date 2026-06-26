import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int curr = 0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    for(int k=j+1;k<nums2.length;k++)
                    {
                        if(nums1[i] < nums2[k])
                        {
                            curr = nums2[k];
                            break;
                        }
                    }
                }
            }
            if(curr>nums1[i])
            {
                arr[i] = curr;
            }
            else
                arr[i] = -1;
        }
        return arr;
    }
}
public class Next_greater_element {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the first array : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr1 = new int[n1]; 
        for(int i=0;i<n1;i++)
        {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the size of the second array : ");
        int n2 = scn.nextInt();
        System.out.println("Enter the sub array elements : ");
        int[] arr2 = new int[n2]; 
        for(int i=0;i<n2;i++)
        {
            arr2[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.nextGreaterElement(arr1, arr2);
        System.out.println("The next greater element");
        for(int i =0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
