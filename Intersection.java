import java.util.*;
class Intersection
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n;
        n=scn.nextInt();
        System.out.println("Enter the first array elements:");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=scn.nextInt();
        }
        System.out.println("Enter the size of the second array:");
        int n1;
        n1=scn.nextInt();
        System.out.println("Enter the second array elements:");
        int arr2[]=new int[n];
        for(int i=0;i<n1;i++)
        {
            arr2[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int[] result = sol.intersection(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1=new HashSet<>();
       for(int num:nums1)
       {
            set1.add(num);
       }
       Set<Integer> set2=new HashSet<>();
       for(int num:nums2)
       {
            if(set1.contains(num))
            {
                set2.add(num);
            }
       }
       int arr[]=new int[set2.size()];
       int i=0;
       for(int num:set2)
       {
            arr[i++]=num;
       }
       return arr;
    } 
}