import java.util.*;
class Linear_search
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
        int result[]=sol.Linear(arr,n);
        System.out.println("The array is in linear order : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution
{
    public int[] Linear(int[] ar,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        return ar;
    }
}