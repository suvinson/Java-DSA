import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 class Solution {
    public int getDecimalValue(ListNode head) {
        int bin=0;
        while(head!=null){
            bin = bin *2 + head.val;
            head = head.next;
        }
        return bin;
    }
}
class Binary_linkedlist{
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        int node;
        System.out.println("Enter the number of nodes : ");
        node = scn.nextInt();
        System.out.println("Enter the node values : ");
        int val=scn.nextInt();
        ListNode head = new ListNode(val);
        ListNode temp = head;
        for(int i=1;i<node;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        Solution sol = new Solution();
        int result = sol.getDecimalValue(head);
        System.out.println("The value is in decimal number : " + result);
    }
}
/*class Solution {
    public int getDecimalValue(ListNode head) {
        String num="";
        if(head.val == 0 && head.next==null)
        {
            return 0;
        }
        if(head.val == 1 && head.next==null)
        {
            return 1;
        }
        while(head!=null)
        {
            num = num + head.val;
            head = head.next;
        }
        int decimal = Integer.parseInt(num,2);
        return decimal;
    }
}*/
