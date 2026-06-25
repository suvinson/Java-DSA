import java.util.*;
class Solution
{
    public  int[] insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    } 
}
public class Insertion_sort {
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
        Solution sol = new Solution();
        int[] result = sol.insertionSort(arr);
        System.out.println("Array in insertion sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
