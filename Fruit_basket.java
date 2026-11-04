import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        int count = 0;
        int l = 0,i = 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        while(i < fruits.length)
        {
            hs.put(fruits[i],hs.getOrDefault(fruits[i] , 0) + 1);
                while(hs.size() > 2) 
                {
                   int key = fruits[l];
                   hs.put(key, hs.get(key) - 1);
                   if (hs.get(key) == 0)
                    {
                        hs.remove(key);
                    }
                    l++;
                }
            if(hs.size() <= 2)
            {
                int len = i - l + 1;
                count = Math.max(count, len);
            }
            i++;
        }
        return count;
    }
}
public class Fruit_basket {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.totalFruit(arr);
        System.out.println("The frequency to contain fruits in two basket is : " + ans);
    }
}
