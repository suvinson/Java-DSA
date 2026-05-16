import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = head;
        if(temp.next == null)
        {
            return null;
        }
        int count=0;
        while(temp2!=null)
        {
            temp2 = temp2.next;
            count+=1;
        }
        int k= count-n+1;
        if(k==1)
        {
            return head.next;
        }
        for(int i= 1;i<k-1;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

class Remove_node
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = scn.nextInt();
        if(n==0)
        {
            System.out.println("The node is empty");
            return ;
        }
        System.out.println("Enter the node values : ");
        int val = scn.nextInt();

        ListNode head = new ListNode(val);
        ListNode temp = head;

        for(int i=1;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        System.out.println("The the node to delete : ");
        int num = scn.nextInt();

        Solution sol = new Solution();
        ListNode result = sol.removeNthFromEnd(head,num);
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}