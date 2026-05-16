import java.util.*;
class Fizz_Buzz
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n=scn.nextInt();
        Solution sol= new Solution();
        List<String> result=sol.fizzBuzz(n);
        System.out.println("The fizzbuzz order : " + result);
    }
}
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ls=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                ls.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                ls.add("Fizz");
            }
            else if(i%5==0)
            {
                ls.add("Buzz");
            }
            else{
                ls.add(String.valueOf(i));
            }
        }
        return ls;
    }
}