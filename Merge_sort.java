import java.util.*;
class Solution
{
    public int[] mergeSort(int[] arr1 ,int start, int mid , int end)
    {
        int i=start,j=mid ,k=start;
        int[] arr3 = new int[arr1.length];
        while(i<mid && j<=end)
        {
            if(arr1[i] <= arr1[j])
            {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                arr3[k] = arr1[j];
                j++;
                k++;
            }
        }
        while(i<mid)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            arr3[k] = arr1[j];
            j++;
            k++;
        }
        for(int r=start;r<=end;r++)
        {
            arr1[r] = arr3[r];
        }
        return arr1;
    }
    public void merge(int[] arr1, int start ,int end)
    {
        if(start >= end)
        {
            return;
        }
        int mid = (start + end) / 2;
        merge(arr1, start, mid);
        merge(arr1, mid + 1, end);
        mergeSort(arr1, start, mid+1, end);
    }
}
public class Merge_sort {
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
        Solution sol = new Solution();
        sol.merge(arr1,0,arr1.length-1);
        System.out.println("Array is in merge sort order : ");
        for(int a=0;a<arr1.length;a++)
        {
            System.out.print(arr1[a] + " ");
        }
    }
}
