import java.util.*;
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
class Sol{
    public int guess(int num, int n)
    {
        Random  rand = new Random();
        int val = rand.nextInt(n);
        if(num == val)
        {
            return 0;
        }
        else if(num > val)
        {
            return -1;
        }
        else
            return 1;
    }
}

class Solution extends Sol {
    public int guessNumber(int n) {
        Sol s = new Sol();

        int low = 1;
        int high = n;
        int mid = low + (high-low)/2;
        while(low<=high)
        {
            int res = s.guess(mid ,n);
            if(res == 0)
            {
                return mid;
            }
            else if(res == 1)
            {
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
            mid = low + (high-low)/2;
        }
        return mid;
    }
}
public class Guess_number {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.println("Enter the size of the number : ");
        int n = scn.nextInt();
        int result = sol.guessNumber(n);
        System.out.println("The guessed number is : " + result);
    }
}
