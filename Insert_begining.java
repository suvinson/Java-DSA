import java.util.*;
public class Insert_begining
{
    private Node head;

    private void insert(int data)
    {
        Node newnode = new Node(data);

        if(head!=null)
        {
            newnode.next=head;
        }
        head = newnode;
    }

    public static void main(String arg[])
    {
        Insert_begining list = new Insert_begining();

        list.insert(40);
        list.insert(50);

        PrintLinkedList.display(list.head);

        list.insert(60);
        list.insert(70);
        list.insert(80);

        PrintLinkedList.display(list.head);

    }
}