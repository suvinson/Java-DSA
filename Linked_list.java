import java.util.*;
public class Linked_list
{
    public static void main(String arg[])
    {
        //hashset have no index
        // it removes the duplicate
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(10);
        ll.add(10);
        ll.add(11);
        System.out.println(ll);
        System.out.println(ll.size());
    }
}