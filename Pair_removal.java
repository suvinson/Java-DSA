import java.util.*;
class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            ls.add(nums[i]);
        }
        while(true)
        {
            boolean sorted = true;
            for(int i = 1; i < ls.size(); i++)
            {
                if(ls.get(i) < ls.get(i - 1))
                {
                    sorted = false;
                    break;
                }
            }
            if(sorted)
            {
                break;
            }
            int min = ls.get(0)+ls.get(1),current = 0,index = 0;
            for(int i=0;i<ls.size()-1;i++)
            {
                current = ls.get(i)+ls.get(i+1);
                if(current<min)
                {
                    min = current;
                    index = i;
                }
            }
            ls.remove(index+1);
            ls.set(index,min);
            count++;
        }
        return count;
    }
}
class Pair_removal
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter the array size : ");
        num = scn.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array values : ");
        for(int i=0;i<num;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.minimumPairRemoval(arr);
        System.out.println("The minimum steps to remove the pair is : " + result);
    }
}