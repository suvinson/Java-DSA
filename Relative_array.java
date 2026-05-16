import java.util.*;
class Relative_array{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the first array size : ");
        n1=scn.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=scn.nextInt();
        }
        System.out.println("Enter the second array size : ");
        n2=scn.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int[] result=sol.relativeSortArray(arr1,arr2);
        System.out.println("Arrays in relative order: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    result.add(arr1[j]);
                    arr1[j]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=-1)
            {
                result.add(arr1[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}