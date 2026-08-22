import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int low = 0;
        int high = n1;

        while(low <= high)
        {
            int cut1 = (low + high) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

            if(left1 <= right2 && left2 <= right1)
            {
                if((n1 + n2) % 2 == 0)
                    return (Math.max(left1,left2) + Math.min(right1,right2)) / 2.0;
                else
                    return Math.max(left1, left2);
            }
            else if(left1 > right2)
            {
                high = cut1 - 1;
            }
            else
                low = cut1 + 1;
        }
        return 0.0;
    }
}
public class Median_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first array size : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the first array elements : ");
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the second array size : ");
        int n2 = scn.nextInt();
        System.out.println("Enter the second array elements : ");
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        double ans = sol.findMedianSortedArrays(arr1, arr2);
        System.out.println("Median of two sorted arrays is : " + ans);
    }
}
