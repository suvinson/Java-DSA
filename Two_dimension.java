import java.util.*;
class Two_dimension
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the matrix: ");
        n=scn.nextInt();
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        int multi[][]=new int[n][n];
        System.out.println("Enter the values for first matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=scn.nextInt();
            }
        }
        System.out.println("Enter the values for second matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=scn.nextInt();
            }
        }
        System.out.println("Multiplication matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                multi[i][j]=0;
                for(int k=0;k<n;k++)
                {
                    multi[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}