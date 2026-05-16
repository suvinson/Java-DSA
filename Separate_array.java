import java.util.*;
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(nums[i]!=0)
            {
                int rev = nums[i]%10;
                arr.add(rev);
                nums[i] /=10;
            }
        }
        Collections.reverse(arr);
        int[] ar = new int[arr.size()];
        for(int i=0;i<ar.length;i++)
        {
            ar[i] = arr.get(i);
        }
        return ar;
    }
}
class Separate_array
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.separateDigits(arr);
        System.out.println("Array in separate digits : ");
        for(int i=0 ;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}