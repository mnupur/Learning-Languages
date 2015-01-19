import java.util.*;

public class Merge
{
public static void main(String[] args)
{
   int[] a = new int[10];
   int[] b = new int[5];
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the array a: ");
   for(int i = 0; i < 5; i++)
   {
      a[i] = in.nextInt();
   }
   System.out.println("Enter the array b: ");
   for(int i = 0; i < 5; i++)
   {
      b[i] = in.nextInt();
   }
   System.out.print("Array a: ");
   for(int i = 0; i < 5; i++)
   {
      System.out.print(a[i] + " ");
   }
   System.out.println();
   System.out.print("Array b: ");
   for(int i = 0; i < 5; i++)
   {
      System.out.print(b[i] + " ");
   }
   System.out.println();
   merge(a,b,5,5);
}
 
public static void merge(int[] a, int[] b, int n, int m)
{
   int k = m + n -1;
   int i = n - 1;
   int j = m - 1;
   while(i >= 0 && j >= 0) 
   {
      if(a[i] < b[j])
          a[k--] = b[j--];
      else 
          a[k--] = a[i--];
   }
   while(j >= 0 )
   {
      a[k--] = b[j--];
   }  
   System.out.print("Merged Array: ");
   for(i = 0; i < 10; i++)
   {
      System.out.print(a[i] + " ");
   }
   System.out.println();
}
}
