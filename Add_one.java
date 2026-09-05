import java.util.*;
class Node
{
    int data;
    ListNode next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Solution
{
    public ListNode addOne(ListNode head)
    {
        //Brute force 
        // Reverse it and add one and reverse it again
       /*  ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode temp = prev;
        int carry = 1;
        while(temp!=null)
        {
            temp.val += carry;
            if(temp.val < 10)
            {
                carry = 0;
                break;
            }
            else
            {
                temp.val = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        current = prev;
        prev = null;
        next = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(carry == 1)
        {
            ListNode newNode = new ListNode(1);
            newNode.next = prev;
            return newNode;
        }
        return prev; */

        //Optimised code 
        int carry = helper(head);
        if(carry == 1)
        {
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            head =  newNode;
        }
        return head;
    }
    private int helper(ListNode head)
    {
        if(head == null)
        {
            return 1;
        }
        int carry = helper(head.next);
        head.val += carry;
        if(head.val < 10)
        {
            return 0;
        }
        head.val = 0;
        return 1;
    }
}
public class Add_one {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = scn.nextInt();
        System.out.println("Enter the nodes values : ");
        int val = scn.nextInt();

        ListNode head = new ListNode(val);
        ListNode temp = head;

        for(int i=1;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        Solution sol = new Solution();
        ListNode ans = sol.addOne(head);
        System.out.println("After adding one to the LL : ");
        while(ans!=null)
        {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }
        System.out.println("null");
    }
}
