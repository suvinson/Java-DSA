import java.util.*;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        ListNode temp = head;
        int count = 1;
        while(temp.next!=null)
        {
            count++;
            temp = temp.next;
        }
        if(k % count == 0)
        {
            return head;
        }
        k = k % count;
        temp.next = head;
        ListNode ans = middle(head,count - k);
        ListNode nextNode = ans.next;
        ans.next = null;
        return nextNode;
    }
    private ListNode middle(ListNode temp,int k)
    {
        while(k!=1)
        {
            temp = temp.next;
            k--;
        }
        return temp;
    }
}
public class Rotate_List {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = scn.nextInt();
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
        System.out.println("Enter the number of times to rotate : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        ListNode ans = sol.rotateRight(head, k);
        System.out.println("List after rotation : ");
        while(ans!=null)
        {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
        System.out.println("null");
    }
}
