import java.util.*;
class Add_array
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n,k;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        System.out.println("Enter the integer to add: ");
        k=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter  the array values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        List<Integer> result=sol.addToArrayForm(arr,k);
        System.out.println("Final array values: "+ result);
    }
}
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=num.length-1;
        int carry=k;
        List<Integer> arr=new ArrayList<>();
        while(i>=0 || carry>0)
        {
            if(i>=0) 
                carry =carry+num[i--];
            arr.add(carry % 10);
            carry =carry/10;
        }
        Collections.reverse(arr);
        return arr;
    }
}