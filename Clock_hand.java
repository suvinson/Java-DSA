import java.util.*;
class Solution {
    public double angleClock(int hour, int minutes) {
         // hour hand = 360 / 12 = 30 degree so 12 * 30 = 360 
         // extra hour = 30 * 0.5 = 15
         // add the hour hand and extra hour
         // minute hand = 360 / 60 = 6 degree so 6 * 30 = 180
         // now hour hand - minute hand 
        double hourHand = (hour * 30) + (minutes * 0.5);
        double minuteHand = minutes * 6;
        double difference =  Math.abs(hourHand - minuteHand);
        return Math.min(difference , 360 - difference);
    }
}
public class Clock_hand {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the hour : ");
        int hour = scn.nextInt();
        System.out.println("Enter the minutes : ");
        int minutes = scn.nextInt();
        Solution sol = new Solution();
        double result = sol.angleClock(hour, minutes);
        System.out.println("Angle between the hands of the clock is : " + result);
    }
}
