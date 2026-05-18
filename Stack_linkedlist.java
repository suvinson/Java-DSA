class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
public class Stack_linkedlist {
    Node top = null;
    void push (int data){
        Node newnode = new Node(data);
        if(top == null)
        {
            top = newnode;
            return;
        }
       newnode.next = top;
       top = newnode;
    }
    int pop(){
        int temp = top.data;
        top = top.next;
        return temp;
    }
    int peek(){
        return top.data ;
    }
    void display(){
        if(top.data>=0)
        {
            System.out.println("Stack elements are : ");
            for(int i=0;i<=top.data;i++)
            {
                System.out.print(top.data + " ");
            }
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
    public static void main(String arg[])
    {
        Stack_array s = new Stack_array();
        int ch;
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.peek");
        System.out.println("4.display");
        do
        {
            System.out.println("Enter your choice :");
            ch = s.scn.nextInt();
            switch(ch)
            {
                case 1:
                {
                    s.push();
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.peek();
                    break;
                }
                case 4:
                {
                    s.display();
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=4);
    }
    
}
