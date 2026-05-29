import java.util.*;
/*
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] used = new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if( nums1[i] == nums2[j] && used[j]!=true)
                {
                    arr.add(nums1[i]);
                    used[j] = true;
                    break;
                }
            }
        }
        int[] arr1 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {

            arr1[i] = arr.get(i);

        }
        return arr1;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
                i++;
        }
        int[] arr1 = new int[arr.size()];
        for (int k= 0; k < arr.size(); k++) {

            arr1[k] = arr.get(k);

        }
        return arr1;
    }
}*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        for(int num : nums1)
        {
            hs.put(num,hs.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums2)
        {
            if(hs.containsKey(num) && hs.get(num)>0)
            {
                arr.add(num);
                hs.put(num,hs.get(num)-1);
            }
        }
        int[] arr1 = new int[arr.size()];
        for (int k= 0; k < arr.size(); k++) {

            arr1[k] = arr.get(k);

        }
        return arr1;
    }
}

public class Intersection_array {
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
        int[] result = sol.intersect(arr1,arr2);
        System.out.println("Intersection of array in both array : ");
        for(int i=0;i<result.length;i++)
            {
                System.out.print(result[i] + " ");
            } 
    }
}
