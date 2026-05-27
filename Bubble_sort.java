import java.util.*;
class Solution{
    public int[] sort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {   //optimised code to converst n^2 to n
            boolean swap = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            //optimised code to converst n^2 to n
            if(swap == false)
            {
                return arr;
            }
        }
        return arr;
    }
}
public class Bubble_sort {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0 ;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.sort(arr);
        System.out.println("Array in sorted order using bubble sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
