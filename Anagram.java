package DataStructures;

import java.util.*;

public class Anagram
{
   public static void main(String[] args)
   {
       	String s = null;
       	String t = null;
	    int flag = 0; 
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter s and t: ");
        s = in.nextLine();
	    t = in.nextLine();
		if(s.length() == t.length())
		{
		   char[] s1 = s.toCharArray();
		   char[] t1 = t.toCharArray();	   
		   s1 = sort(s1);
		   System.out.print("s1 after sorting: ");
		   for(int i=0;i<s1.length;i++)
		   {
			   System.out.println(s1[i]);
		   }
		   t1 = sort(t1);
		   System.out.print("t1 after sorting: ");
		   for(int i=0;i<t1.length;i++)
		   {
			   System.out.println(t1[i]);
		   }
		   for(int i=0;i<s1.length;i++)
		   {
		        if(s1[i] != t1[i])
			       {
				          System.out.println("These strings are not anagrams.");
		                  flag = 1;
				   }
				if(flag == 1)
				   break;
		     }
			 if(flag == 0)
			 {
				 System.out.println("These strings are anagrams.");
			  }
		} 
		else
			System.out.println("These Strings are not anagrams.");
   }
   public static char[] sort(char[] q)
   {
	 int i = 0;
	 int key = ' ';
	 for(int j=1;j<q.length;j++)
	{
	    key = (int)q[j];
	    i = j-1;
	    while(i>=1 && q[i]>key)
	    {
		q[i+1]=q[i];
		i--;
	    }
	    q[i+1]=(char)key;
	}   
        return q;
   }
}
