import java.util.*;
public class Hash_set
{
    public static void main(String arg[])
    {
        //hashset have no index
        // it removes the duplicate
        HashSet<Integer> hsh= new HashSet<>();
        hsh.add(10);
        hsh.add(10);
        hsh.add(11);
        System.out.println(hsh);
    }
}