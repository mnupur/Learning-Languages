import java.util.*;



public class BitSet
{
public static void main(String[] args)
{
   Scanner in = new Scanner(System.in);
   int n=0,m=0,i=0,j=0;
   System.out.println("Please enter the number N: ");
   n = in.nextInt();
   System.out.println("Please enter the number M: ");
   m = in.nextInt();
   System.out.println("Please enter i: ");
   i = in.nextInt();
   System.out.println("Please enter j: ");
   j = in.nextInt();
   n = updateBits(n,m,i,j);
   System.out.println("The value of n after setting the bits: " +n);
}

public static int updateBits(int n, int m, int i, int j)
{
   int max = ~0;
   int left = max - ((1 << j) - 1);
   int right = (1 << i) - 1;
   int mask = left | right;
   return (n & mask) | (m << i);
}
}
