import java.util.*;
class Seat
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the size of the seats in bus : ");
        n1=scn.nextInt();
        System.out.println("Enter the number of the students in bus : ");
        n2=scn.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        System.out.println("Enter the seats one by one : ");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=scn.nextInt();
        }
        System.out.println("Enter the students count one by one : ");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result=sol.minMovesToSeat(arr1,arr2);
        System.out.println("Minimum number of seats to move everyone is : " + result);
    }
}
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++)
        {
            if(students[i]>seats[i]){
                sum+=students[i]-seats[i];
            }
            else
                sum+=seats[i]-students[i];
                //sum+=Math.abs(seats[i] - students[i]);
        }
        return sum;
    }
}
