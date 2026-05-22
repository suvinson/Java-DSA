import java.util.*;
public class Queue_array {
    Scanner scn = new Scanner(System.in);
    int n;
    int queue[];
    int front = -1;
    int rear = -1;
    Queue_array(){
        System.out.println("Enter the array size : ");
        n = scn.nextInt();
        queue = new int[n];
    }
    void enqueue()
    {
        System.out.println("Enter the value :");
        int val = scn.nextInt();
        if(rear == n)
        {
            throw new IndexOutOfBoundsException("Queue overflow"); 
        }
        else
        {
            if(front == -1)
            {
                front++;
            }
            queue[++rear] = val;
        }
    }
    void dequeue()
    {
        if((front == -1 && rear == -1 ) || (front > rear))
        {
            throw new IndexOutOfBoundsException("Queue underflow"); 
        }
        System.out.println("Dequeued element is : " + queue[front]);
        front++;
    }
    void display()
    {
        if((front == -1 && rear == -1 ) || (front > rear))
        {
            throw new IndexOutOfBoundsException("Queue is empty"); 
        }
        else 
        {
            System.out.println("Queue elements are ");
            for(int i = front ;i<=rear ;i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Queue_array que = new Queue_array();
        int ch;
        System.out.println("1.enqueue");
        System.out.println("2.dequeue");
        System.out.println("3.display");
        do
        {
            System.out.println("Enter your choice :");
            ch = que.scn.nextInt();
            switch(ch)
            {
                case 1:
                {
                    que.enqueue();
                    break;
                }
                case 2:
                {
                    que.dequeue();
                    break;
                }
                case 3:
                {
                    que.display();
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=3);
    }
}
