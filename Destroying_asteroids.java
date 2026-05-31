import java.util.*;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mass1 = mass;
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]> mass1) 
                return false;
            else
            {
                mass1 += asteroids[i];
            }
        }
        return true;
    }
}
public class Destroying_asteroids {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the asteroid masses one by one : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the mass of the planet : ");
        int mass = scn.nextInt();
        Solution sol = new Solution();
        boolean result = sol.asteroidsDestroyed(mass, arr);
        if(result)
        {
            System.out.println("The planet destroyed all the asteroids ");
        }
        else
            System.out.println("The asteroid destroyed the planet ");
    }
}
