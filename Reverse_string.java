import java.util.*;
class Reverse_string
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=scn.nextInt();
        char[] ch = new char[n];
        System.out.println("Enter character one by one : ");
        for(int i=0;i<n;i++)
        {
            ch[i] = scn.next().charAt(0);
        }
        Solution sol= new Solution();
        char[] result=sol.reverseString(ch);
         System.out.println("Character in reverse order : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution {
    public char[] reverseString(char[] s) {
       /* for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                if(j<s.length){
                    char temp= s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }*/
       //optimized way 
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp= s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
       return s;
    }
}