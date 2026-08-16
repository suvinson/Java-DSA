import java.util.*;
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int index = -1;
        int minDistance = Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++)
            {
                int x = drones[i][0];
                int y = drones[i][1];
                int range = drones[i][2];
                int distance = Math.abs(x - target[0]) + Math.abs(y - target[1]);

            
            if (distance <= range && distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }
        return index;
    }
}
public class Drone {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the row and column : ");
        int m = scn.nextInt();
        int n = scn.nextInt();
        System.out.println("Enter the matrix elements : ");
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the array size : ");
        int o = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] ar = new int[o];
        for(int i=0;i<o;i++)
        {
            ar[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.nearestDrone(arr, ar);
        System.out.println("The neareastDrone index is : " + ans);
    }
}
