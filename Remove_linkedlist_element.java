import java.util.*;
class ListNode {
     int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while(head!=null && head.val == val)
            head = head.next;
        while(temp!=null && temp.next!=null)
        {
            if(temp.next!=null && temp.next.val== val)
                temp.next = temp.next.next;
            if(temp.next != null && temp.next.val!=val)
                temp = temp.next;
        }
        return head;
    }
}

public class Remove_linkedlist_element {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of the node : ");
        int n = scn.nextInt();
        System.out.println("Enter the node values :");
        int val = scn.nextInt();

        ListNode head = new ListNode(val);
        ListNode temp = head;
        for(int i=1;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        System.out.println("Enter the value to remove : ");
        int v = scn.nextInt();

        Solution sol = new Solution();
        ListNode result = sol.removeElements(head, v);
        System.out.println("After removing the element from the linked list : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
