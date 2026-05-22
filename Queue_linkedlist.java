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
public class Queue_linkedlist {
    Scanner scn = new Scanner(System.in);
    Node front,rear;
    Queue_linkedlist()
    {
        front = null;
        rear = null;
    }
    void enqueue(int data)
    {
        Node newnode = new Node(data);
        if(front == null)
        {
            front = newnode;
            rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = rear.next;
    }
    int dequeue()
    {
        if(front == null)
        {
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        int temp = front.data;
        front = front.next;
        if(front == null)
        {
            rear = null;
        }
        return temp;
    }
    void display()
    {
        if(front == null)
        {
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
            System.out.println("Queue elements are : ");
            Node temp = front;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
    }
    public static void main(String arg[])
    {
        Queue_linkedlist q = new Queue_linkedlist();
        int ch;
        System.out.println("1.enqueue");
        System.out.println("2.dequeue");
        System.out.println("3.display");
        System.out.println("4.exit");
        do
        {
            System.out.println("Enter your choice :");
            ch = q.scn.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the element to enqueue : ");
                    int val= q.scn.nextInt();
                    q.enqueue(val);
                    break;
                }
                case 2:
                {
                    int deleted = q.dequeue();
                    System.out.println("Deleted element : " + deleted);
                    break;
                }
                case 3:
                {
                    q.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=4);
    }
}
