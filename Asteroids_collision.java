import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < asteroids.length; i++)
        {
            if(asteroids[i] < 0)
            {
                while(true)
                {
                    if(stk.isEmpty())
                    {
                        stk.push(asteroids[i]);
                        break;
                    }
                    if(stk.peek() == Math.abs(asteroids[i]))
                    {
                        stk.pop();
                        break;
                    }
                    if(stk.peek() < 0 )
                    {
                        stk.push(asteroids[i]);
                        break;
                    }
                    if(stk.peek() < Math.abs(asteroids[i]))
                    {
                        stk.pop(); 
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else
            {
                stk.push(asteroids[i]);
            }
        }
        int arr[] = new int[stk.size()];
        for(int i = stk.size() - 1 ; i >= 0 ; i--)
        {
            arr[i] = stk.pop();
        }
        return arr;
    }
}
public class Asteroids_collision {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements ; ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[] ans = sol.asteroidCollision(arr);
        System.out.println("After asteroid collision : ");
        for(int i = 0 ; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
