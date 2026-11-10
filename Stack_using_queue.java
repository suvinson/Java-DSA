import java.util.*;
class MyStack {
    
    private Queue<Integer> q;

    public MyStack() {
       q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0 ; i < q.size() - 1 ; i++)
        {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class Stack_using_queue {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        MyStack obj = new MyStack();
        int ch;
        System.out.println(" 1 . Push , 2 . Pop , 3 . peek , 4 . Empty : ");
        do
        {
            System.out.println("Enter your choice : " );
            ch = scn.nextInt();
            switch(ch)
            {
                case 1 : 
                {
                    System.out.println("Enter the element to push : ");
                    int x = scn.nextInt();
                    obj.push(x);
                    continue;
                }
                case 2 : 
                {
                    System.out.println("The popped element : " + obj.pop());
                    continue;
                }
                case 3 : 
                {
                    System.out.println("The peek element is : " + obj.top());
                    continue;
                }
                case 4 : 
                {
                    System.out.println("The queue is : " + obj.empty());
                    continue;
                }
            }
        }while(ch != 4);
    }
}
