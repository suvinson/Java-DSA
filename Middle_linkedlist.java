import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head ;
        int count=0;
        while(temp.next!=null)
        {
            temp = temp.next;
            count++;
        }
        count++;
        for(int i=0;i<count/2;i++)
        {
            head = head.next;
        }
        return head;
    }
}
 class Middle_linkedlist
 {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = scn.nextInt();   
        if (n == 0) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Enter values: ");
        int val = scn.nextInt();

        ListNode head = new ListNode(val);
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        
        Solution obj = new Solution();
        ListNode middle = obj.middleNode(head);
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
        scn.close();
    }
 }
 