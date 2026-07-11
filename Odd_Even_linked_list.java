import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head ; 
        while(temp!=null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i=0;i<arr.size();i++)
        {
            if(i % 2 == 0)
            {
                arr1.add(arr.get(i));
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            if(i % 2 == 1)
            {
                arr1.add(arr.get(i));
            }
        }
        ListNode h = new ListNode(0);
        ListNode t = h;
        for(int i=0;i<arr1.size();i++)
        {
            ListNode  n = new ListNode(arr1.get(i));
            t.next = n;
            t = t.next;
        }
        return h.next;

    }
}
public class Odd_Even_linked_list {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");

        int n = scn.nextInt();

        System.out.println("Enter the node values:");

        ListNode head = null;

        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            int val = scn.nextInt();

            ListNode node = new ListNode(val);

            if (head == null) {

                head = node;

                tail = node;

            } else {

                tail.next = node;

                tail = node;

            }

        }

        Solution obj = new Solution();

        ListNode result = obj.oddEvenList(head);

        System.out.println("Odd-Even Linked List:");

        while (result != null) {

            System.out.print(result.val + " ");

            result = result.next;

        }
    }
}
