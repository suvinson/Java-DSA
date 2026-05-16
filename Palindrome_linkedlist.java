import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public boolean isPalindrome(ListNode temp) {
        ListNode copy = temp;
        int count=0;
        ListNode prev = null;
        ListNode current = temp;
        ListNode next = null;
        while(copy!=null)
        {
            copy = copy.next;
            count++;
        }
        count/=2;
        while(count>0)
        {
            current = current.next;
            count--;
        }
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode temp1 = prev;
        while(temp!=null && temp1!=null)
        {
            if(temp.val != temp1.val)
            {
                return false;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        return true;
    }
}
class Palindrome_linkedlist
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of first nodes : ");
        int n=scn.nextInt();
        System.out.println("Enter the first node values : ");
        int val=scn.nextInt();
        
        ListNode head = new ListNode(val);
        ListNode temp2 = head;
        for(int i=1 ;i<n;i++)
        {
            val = scn.nextInt();
            temp2.next = new ListNode(val);
            temp2 = temp2.next;
        }

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(head);
        if(result)
        {
            System.out.println("It is a palindrome linkedlist ");
        }
        else 
        {
            System.out.println("It is not a palindrome linkedlist ");
        }
    }
}