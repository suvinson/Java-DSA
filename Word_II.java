import java.util.*;
class Solution {
    public int minimumPushes(String word) {
         Map<Character,Integer> hs = new HashMap<>();
         for(char ch : word.toCharArray())
         {
            hs.put(ch,hs.getOrDefault(ch,0)+1);
         }
         List<Integer> arr = new ArrayList<>();
         for(int i : hs.values())
         {
            arr.add(i);
         }
         Collections.sort(arr,Collections.reverseOrder());
        int ans = 0;
        for(int i=0;i<arr.size();i++)
        {
            int pushes = i / 8 + 1;
            ans += pushes * arr.get(i);
        }
        return ans;
    }
}
public class Word_II {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String str = scn.nextLine();
        Solution sol = new Solution();
        int result = sol.minimumPushes(str);
        System.out.println("Minimum Number of Pushes to Type Word I : " + result);
    }
}
