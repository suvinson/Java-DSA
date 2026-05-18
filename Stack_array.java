import java.util.*;
public class Stack_array {
    Scanner scn = new Scanner(System.in);
    int n;
    int[] stack;
    int top = -1;
    Stack_array(){
        System.out.println("Enter the array size :");
        n = scn.nextInt();
        stack = new int[n];
    }
     void push(){
        if(top == n-1){
            System.out.println("Stack overflow");
        }
        else{
            top = top+1;
            System.out.println("Enter the value to push : ");
            int val = scn.nextInt();
            stack[top] = val;
        }
    }
     void pop(){
        if(top <=-1)
        {
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("popped element from stack is : " + stack[top]);
            top = top-1;
        }
    }
     void peek(){
        if(top <=-1)
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element from stack is : " + stack[top]);
        }
    }
     void display(){
        if(top>=0)
        {
            System.out.println("Stack elements are : ");
            for(int i=0;i<=top;i++)
            {
                System.out.print(stack[i] + " ");
            }
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
    public static void main(String arg[]){
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
