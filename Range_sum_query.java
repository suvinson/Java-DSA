import java.util.*;
class NumArray {
    /*int[] arr;
    public NumArray(int[] nums) {
        arr=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<right+1;i++)
        {
            sum += arr[i];
        }
        return sum;*/
    int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if(left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}
class Range_sum_query {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=scn.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array values : ");
        for(int i=0;i<n;i++)
        {
            nums[i]=scn.nextInt();
        }
        NumArray obj = new NumArray(nums);

        System.out.println("Enter the left and right poistion from the array :");
        int left = scn.nextInt();
        int right = scn.nextInt();
        System.out.println("Sum is : " + obj.sumRange(left,right));
    }
}
