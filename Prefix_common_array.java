import java.util.*;
/*class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] c = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            int count = 0;
            for(int j=0;j<=i;j++)
            {
                for(int k=0;k<=i;k++)
                {
                    if(A[j] == B[k])
                    {
                        count++;
                    }
                }
            }
            c[i] = count;
        }
        return c;
    }
}*/
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[A.length+1];
        int[] c= new int[A.length];
        int count = 0;
        for(int i=0;i<A.length;i++)
        {
            freq[A[i]]++;
            freq[B[i]]++;
            
            if(A[i] == B[i])
            {
                count++;
            }
            else
            {
                if(freq[A[i]] == 2)
                {
                    count++;
                }
                if(freq[B[i]] == 2)
                {
                    count++;
                }   
            }
            c[i] = count;
        }
        return c;
    }
}
public class Prefix_common_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scn.nextInt();
        System.out.println("Enter the first array values : ");
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the second array values : ");
        int[] arr2 = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr2[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.findThePrefixCommonArray(arr1, arr2);
        System.out.println("The Prefix Common Array of Two Arrays : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
