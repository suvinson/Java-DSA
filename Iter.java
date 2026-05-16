import java.util.*;
public class Iter
{
    public static void main(String arg[])
    {
        //it have long size of array in dynamic 
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(11);
        System.out.println(arr);

        Iterator it=arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}