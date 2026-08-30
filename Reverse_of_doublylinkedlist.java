class Node
{
    int data;
    Node next;
    Node prev;
     
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class Reverse_of_doublylinkedlist {
    Node head=null;

    void insertBegining(int data){
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        newnode.next=head;
        head.prev = newnode;
        head = newnode;
    }
    void reverse()
    {
        Node temp = null;
        Node current = head;
        while(current!=null)
        {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) 
        {
            head = temp.prev;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String arg[])
    {
        Reverse_of_doublylinkedlist ll = new Reverse_of_doublylinkedlist();
        ll.insertBegining(0);
        ll.insertBegining(1);
        ll.insertBegining(2);
        ll.insertBegining(3);
        ll.display();
        ll.reverse();
        System.out.println();
        ll.display();

    }
}
