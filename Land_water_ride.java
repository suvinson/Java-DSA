import java.util.*;
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) { 
        int min = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length; i++)
        {
            for(int j=0;j<waterStartTime.length; j++)
            {
                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int waterFinish = waterStart + waterDuration[j];
                min = Math.min(min, waterFinish);
                
                int waterFinishFirst = waterStartTime[j] + waterDuration[j];
                int landStartSecond = Math.max(waterFinishFirst, landStartTime[i]);
                int landFinishSecond = landStartSecond + landDuration[i];
                min = Math.min(min, landFinishSecond);
            }
        }   
        return min;
    }
}
public class Land_water_ride {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of land rides: ");
        int n = scn.nextInt();
        System.out.print("Enter number of water rides: ");
        int m = scn.nextInt();
        int[] landStartTime = new int[n];
        int[] landDuration = new int[n];
        int[] waterStartTime = new int[m];
        int[] waterDuration = new int[m];
        System.out.println("Enter land start times:");
        for(int i = 0; i < n; i++) {
            landStartTime[i] = scn.nextInt();
        }
        System.out.println("Enter land durations:");
        for(int i = 0; i < n; i++) {
            landDuration[i] = scn.nextInt();
        }
        System.out.println("Enter water start times:");
        for(int i = 0; i < m; i++) {
            waterStartTime[i] = scn.nextInt();
        }
        System.out.println("Enter water durations:");
        for(int i = 0; i < m; i++) {
            waterDuration[i] = scn.nextInt();
        }
        Solution obj = new Solution();
        int ans = obj.earliestFinishTime(landStartTime,landDuration,waterStartTime,waterDuration);
        System.out.println("Earliest Finish Time = " + ans);
    }
}
