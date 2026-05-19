import java.util.*;
/*class Solution {
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
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    return nums1[i];
                }
            }
        }
        return -1;
    }
}*/
 class Solution{
    public int getCommon(int[] nums1, int[] nums2){
        //Arrays.sort(nums1);
        //Arrays.sort(nums2);
        Set<Integer> st = new HashSet<>();
        for(int num:nums1)
        {
            st.add(num);
        }
        Set<Integer> s = new HashSet<>();
        for(int num:nums2)
        {
            if(st.contains(num)){
                s.add(num);
                return num;
            }
        }
        return -1;
    }
 }
public class Minimum_common_value {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the first array : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the first array elements : ");
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the size of the second array : ");
        int n2 = scn.nextInt();
        System.out.println("Enter the second array elements : ");
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.getCommon(arr1, arr2);
        System.out.println("The minimum common value is : " + result);

    }
}
