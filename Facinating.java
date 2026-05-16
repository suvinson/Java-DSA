import java.util.*;
class Facinating // if number contain 1 to 9 it is a facinating number
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution ();
        boolean result=sol.isFascinating(num);
        if(result==true)
            System.out.println(num + " It is a fascinating number");
        else
            System.out.println(num + " It is not a fascinating number");
    }
}
class Solution {
    public boolean isFascinating(int n) {
      int n1=n*2;
      int n2=n*3;
      String r =String.valueOf(n)+String.valueOf(n1)+String.valueOf(n2); 
      char arr[]=new char[r.length()];
      if(r.length() != 9)
            return false;
      for(int i=0;i<r.length();i++)
      {
            arr[i]=r.charAt(i);
      }
      for(int i=0;i<arr.length;i++)
      {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
      }
      for(int i=0;i<9;i++)
      {
        if(arr[i]!=i+'1')
        {
            return false;
        }
      }
      return true;
    }
}