import java.util.*;
class Add_element{
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        int n,n1,size;
        System.out.println("Enter the array size : ");
        size=scn.nextInt();
        System.out.println("Enter the index and the element to add if have 0 number : ");
        n=scn.nextInt();
        n1=scn.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result[]=sol.Num(arr,size,n,n1);
        System.out.println("Element added : ");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        }
    }
}
class Solution {
    public int[] Num(int []arr,int size,int n,int n1){
        if(n<=arr.length && n>=0){
            for(int i=size;i>n;i--){
                arr[i]=arr[i-1];
            }
            arr[n]=n1;
            n++;
        }
        else{
            System.out.println("Invalid syntax");
        }
        return arr;
    }
}