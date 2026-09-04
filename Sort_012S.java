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
class Solution
{
    public ListNode sort(ListNode head)
    {
       /*  int count0 = 0 , count1 = 0 , count2 = 0 ;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val == 0)
                count0++;
            else if(temp.val == 1)
                count1++;
            else
                count2++;
            
            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            if(count0!=0)
            {
                temp.val = 0;
                count0--;
            }
            else if(count1!=0)
            {
                temp.val = 1;
                count1--;
            }
            else
            {
                temp.val = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head; */

        ListNode temp = head;
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);

        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;

        if(temp == null || temp.next == null)
            return null;

        while(temp!=null)
        {
            if(temp.val == 0)
            {
                zero.next = temp;
                zero = temp;
            }
            else if(temp.val == 1)
            {
                one.next = temp;
                one = temp;
            }
            else
            {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        ListNode newHead = zeroHead.next;
        return newHead;

    }
}
public class Sort_012S {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n=scn.nextInt();
        if (n <= 0) 
        {
            System.out.println("The linked list is empty.");
            return;
        }
        System.out.println("Enter the  nodes values : ");
        int val=scn.nextInt();
        
        ListNode head = new ListNode(val);
        ListNode temp = head;
        for(int i=1 ;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        Solution sol = new Solution();
        ListNode ans = sol.sort(head);
        while(ans!=null)
        {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
        System.out.print("null");
    }
}
