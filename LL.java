import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LL {
    Node head = null;

    void insertBegining(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void disp()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    private static Node arrayTraverse(int[] arr)
    {
        Node newnode = new Node(arr[0]);
        Node mover = newnode;
        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return newnode;
    }
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        LL ls = new LL();
        int[] arr = {1,2,3,4};
        Node head = arrayTraverse(arr);
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        ls.disp();
    }
}
