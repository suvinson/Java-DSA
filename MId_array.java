import java.util.*;
class Solution{
    public int[] midJoin(int[] arr, int k)
    {
        int mid = arr.length/2;
        int[] ans = new int[arr.length+1];
        for(int i=0;i<mid;i++)
        {
            ans[i] = arr[i];
        }
        ans[mid] = k;
        int j = mid;
        for(int i=mid+1;i<ans.length;i++)
        {
            ans[i] = arr[j];
            j++;
        }
        return ans;
    }
}
public class MId_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to add in the middle : ");
        int k = scn.nextInt();
        Solution sol  = new Solution();
        int[] result = sol.midJoin(arr, k);
        System.out.println("The array after inserting the middle element : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
