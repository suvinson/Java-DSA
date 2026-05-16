import java.util.*;
class Sixty_nine
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number only 6 and 9 : ");
        num=scn.nextInt();
        Solution sol = new Solution();
        int result=sol.maximum69Number(num);
        System.out.println("After changed the highest value : " + result);
        
    }
}
class Solution {
    public int maximum69Number (int num) {
        char[] arr=String.valueOf(num).toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='6')
            {
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}