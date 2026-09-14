import java.util.*;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        while(temp != null)
        {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }
        temp = head;
        while(temp!=null)
        {
            Node copy = temp.next;
            
            if(temp.random != null)
            {
                copy.random = temp.random.next;
            }
            else
            {
                copy.random = null;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;
        
        while(temp != null)
        {
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
public class Random_pointer {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");

        int n = scn.nextInt();

        if (n == 0) {

            System.out.println("Original list is empty.");

            System.out.println("Copied list is empty.");

            return;

        }

        Node[] nodes = new Node[n];

        // Get node values

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {

            int value = scn.nextInt();

            nodes[i] = new Node(value);

        }

        // Create next pointers

        for (int i = 0; i < n - 1; i++) {

            nodes[i].next = nodes[i + 1];

        }

        // Get random pointers

        System.out.println("Enter random pointer indices (-1 for null):");

        for (int i = 0; i < n; i++) {

            int randomIndex = scn.nextInt();

            if (randomIndex == -1) {

                nodes[i].random = null;

            } else {

                nodes[i].random = nodes[randomIndex];

            }

        }

        Node head = nodes[0];
        Solution obj = new Solution();

        Node copiedHead = obj.copyRandomList(head);

        // Print copied list

        System.out.println("Copied list:");

        Node temp = copiedHead;

        while (temp != null) {

            System.out.print("[" + temp.val + ", ");

            if (temp.random != null) {

                System.out.print(temp.random.val);

            } else {

                System.out.print("null");

            }

            System.out.print("]");

            if (temp.next != null) {

                System.out.print(" -> ");

            }

            temp = temp.next;

        }
        System.out.println();
    }
}
