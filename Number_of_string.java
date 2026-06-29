import java.util.*;
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(int i = 0;i<patterns.length;i++)
        {
            if(word.contains(patterns[i]))
            {
                count++;
            }
        }
        return count;
    }
}
public class Number_of_string {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the string array : ");
        int n = scn.nextInt();
        System.out.println("Enter the string array elements : ");
        String[] str = new String[n];
        for(int i=0;i<n;i++)
        {
            str[i] = scn.next();
        }
        System.out.println("Enter the word to search : ");
        String word = scn.next();
        Solution sol = new Solution();
        int result = sol.numOfStrings(str,word);
        System.out.println("The word is exist in the string array is : " + result);
    }
}
