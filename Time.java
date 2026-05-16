import java.util.*;
class Time
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int t1,t2;
        System.out.println("Enter the arrival time : ");
        t1=scn.nextInt();
        System.out.println("Enter the delayed time : ");
        t2=scn.nextInt();
        Solution sol= new Solution ();
        int result = sol.findDelayedArrivalTime(t1,t2);
        System.out.println("The train  arrived  the station at : " + result);
    }
}
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime+delayedTime==24)
            return 0;
        else if(arrivalTime+delayedTime>24)
            return (arrivalTime+delayedTime)%24;
        else 
            return arrivalTime+delayedTime;
        
    }
}