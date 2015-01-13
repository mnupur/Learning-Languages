package DataStructures;

import java.util.*;

public class Rotation{
  public static void main(String[] args)
  {
	String str,str1;
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the strings: ");
        str = in.nextLine();
	str1 = in.nextLine();
	String str2 = str+str;
	boolean b = false;
	b = isSubstring(str1,str2);
	if(b)
	{
	    System.out.println(str1 + " is a rotation of " + str);
	}
	else
	{
	    System.out.println(str1 + " is not a rotation of " + str);
	}
  }
  public static boolean isSubstring(String str1,String str2)
  {
  	boolean b = str2.toLowerCase().contains(str1.toLowerCase());
        return b;
  }
}
