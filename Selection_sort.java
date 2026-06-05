import java.util.*;
class Selection_sort
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the  array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result[]=sol.Select(arr,n);
        System.out.println("The array is in Selection sort order : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution
{
    public int[] Select(int[] ar,int n)
    {
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                if(ar[j]<ar[min])
                {
                    min=j;
                }
            }
            int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
        }
        return ar;
    }
}
/*
for(int i=0;i<n;i++)
{
    int min = arr[i];
    int min_index = i;
    for(int j=i=1;j<n;j++)
    {
        if(arr[j]<arr[index])
        {
            min = arr[j];
            min_index  = j;
        }
    }
    int temp = arr[j];
    arr[j] = arr[min_index];
    arr[min_index] = temp;
}
*/