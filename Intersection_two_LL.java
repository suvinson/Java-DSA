import java.util.*;
class ListNode 
{
      int val;
      ListNode next;
      ListNode(int x)
        {
          val = x;
          next = null;
        }
}
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /* HashMap<ListNode,Integer> hs = new HashMap<>();
        ListNode temp1 = headA;
        while(temp1!=null)
        {
            hs.put(temp1,hs.getOrDefault(temp1,0) + 1);
            temp1 = temp1.next;
        }
        ListNode temp2 = headB;
        while(temp2!=null)
        {
            if(hs.containsKey(temp2))
            {
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null; */

        //distance method 
        /* ListNode temp = headA;
        int count1 = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count1++;
        }
        temp = headB;
        int count2 = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count2++;
        }
        if(count1 < count2)
        {
            return collide(headA,headB,count2 - count1);
        }
        else
            return collide(headB,headA,count1 - count2); */
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(temp1 == null || temp2 == null)
            return null;
        while(temp1!=temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == temp2)
                return temp1;
            if(temp1 == null)
            {
                temp1 = headB;
            }
            if(temp2 == null)
            {
                temp2 = headA;
            }
        }
        return temp1;
    }
    /* private ListNode collide(ListNode small , ListNode big , int distance)
    {
        ListNode temp = big;
        while(distance!=0)
        {
            temp = temp.next;
            distance--;
        }
        ListNode temp2 = small;
        while(temp != temp2)
        {
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp;
    } */
}
public class Intersection_two_LL {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of first node : ");
        int n = scn.nextInt();
        if (n <= 0) 
        {
            System.out.println("The linked list is empty.");
            return;
        }
        System.out.println("Enter the first nodes values : ");
        int first = scn.nextInt();
        
        ListNode head = new ListNode(first);
        ListNode temp = head;
        for(int i=1 ;i<n;i++)
        {
            first = scn.nextInt();
            temp.next = new ListNode(first);
            temp = temp.next;
        }
        System.out.println("Enter the number of second node : ");
        int n1 = scn.nextInt();
        if (n1 <= 0) 
        {
            System.out.println("The linked list is empty.");
            return;
        }
        System.out.println("Enter the second nodes values : ");
        int second = scn.nextInt();
        
        ListNode head1 = new ListNode(second);
        ListNode temp1 = head1;
        for(int i=1 ;i<n1;i++)
        {
            second = scn.nextInt();
            temp1.next = new ListNode(second);
            temp1 = temp1.next;
        }
        ListNode intersection = head;
        intersection = intersection.next.next;
        temp1.next = intersection;
        Solution sol = new Solution();
        ListNode ans = sol.getIntersectionNode(head, head1);
        if(ans!=null)
            System.out.println("The intersection is : " + ans.val);
        else
            System.out.println("There is no intersection ");
    }
}
