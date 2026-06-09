import java.util.*;
class Solution
{
    public static int partition(int[] arr, int low , int high)
    {
        int pivot = arr[low];
        int i = low ;
        int j = high;
        while(i<j)
        {
            while(i<=high && arr[i] <= pivot)
            {
                i++;
            }
            while(j>low && arr[j] > pivot)
            {
                j--;
            }
            if(i<j)
            {
                swap(arr,i,j);
            }
        }
        swap(arr,j,low);
        return j;
    }
    public static void swap(int arr[] , int i, int j)
    {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp;
    }
    public static int[] quickSort(int[] arr, int low , int high)
    {
        if(low<high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        return arr;
    }
}
public class Quick_sort {
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
        int[] result = sol.quickSort(arr, 0, arr.length-1);
        System.out.println("The element is sorted using quick sort method : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }

    }
}
