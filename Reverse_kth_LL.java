import java.util.*;
class ListNode 
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nextNode = null;
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode kth = findK(temp,k);
            if(kth == null)
            {
                if(prev!=null)
                {
                    prev.next = temp;
                }
                break;
            }
            nextNode = kth.next;
            kth.next = null;
            ListNode reverse = findReverse(temp);
            if(temp == head)
            {
                head = kth;
            }
            else
            {
                prev.next = kth;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }
    private ListNode findReverse(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    private ListNode findK(ListNode head, int k)
    {
        while(head!=null && k!=1)
        {
            head = head.next;
            k--;
        }
        return head;
    }
}
public class Reverse_kth_LL {
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
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        ListNode ans = sol.reverseKGroup(head, k);
        System.out.println("The Reversed Nodes in k-Group : ");
        while(ans!=null)
        {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
        System.out.println("null");
    }
}
