package DataStructures;

import java.util.*;

public class NthToLast{
   public static void main(String[] args)
   {
      int d;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the position from the last to be found: ");  
      int n = in.nextInt();
      System.out.println("Enter the data for the linked list: ");
      Node l = new Node(in.nextInt()); 
      for(int i=0;i<5;i++)
      {
          d = in.nextInt();
          l.appendToTail(d);
      }
      Node head = l;
      System.out.println("The linked list is as below: ");
      while(l != null)
      {
        if(l.next != null)
    	  System.out.print(l.data + " --> ");
        else
    	  System.out.print(l.data);   
        l = l.next;
      }
      System.out.println();
      l = head;
      findNthToLast(l,n);
   }
   public static void findNthToLast(Node l, int n)
   {
       Node head = l;
       Node p1, p2;
       p1 = l;
       p2 = l;
       for(int i=0;i<n - 1;i++)
       {
          p2 = p2.next;
          if(p2.next == null) System.out.println("The list is smaller than n.");
       }   
       while(p2.next != null)
       {
            p1 = p1.next;
            p2 = p2.next;
       }
       System.out.println("The nth to last element is: "+p1.data);
   }
}
