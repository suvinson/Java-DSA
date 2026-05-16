import java.util.*;
public class Stack_01{
    public static void main(String arg[])
    {
        Stack<Integer> stk=new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.add(3);
        System.out.println(stk.peek());
        System.out.println(stk);
        stk.pop();
        stk.remove(1);
        System.out.println(stk);
    }
}