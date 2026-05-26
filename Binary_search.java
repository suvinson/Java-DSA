import java.util.*;
class Solution{
    public int binarySearch(int[] arr ,int target)
    {
        Arrays.sort(arr);
        System.out.print("The elements in sorted order : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");   
        }
        System.out.println();
        if(arr[0] > arr[arr.length-1])
        {
            return -1;
        }
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high) / 2;
        while(low<=high)
        {
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        return -1;
    }
}
public class Binary_search {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array values in ascending order : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to search : ");
        int target = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.binarySearch(arr,target);
        if(result < 0)
        {
            System.out.println("Invalid target");
        }
        else
        {
            System.out.println("The target element is found in the position of : " + result);
        }

    }
}
