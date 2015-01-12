//How to detect if a String is Unique? --- Time Complexity O(n^2)

import java.util.*;

public class StringUnique {
	public static void main(String[] args)
	{
		int flag = 0;
	 	String s = null;
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the string:");
		s = in.nextLine();
		for (int i=0;i<s.length() - 1;i++)
			{
				flag = 0;
				char b = s.charAt(i);
				System.out.println("b: "+b);
				for (int j = i+1; j<s.length(); j++)
				{
					char c = s.charAt(j);
					System.out.println("c: "+c);
					if (b == c)
					{
						System.out.println("The String is not Unique");
						flag = 1;
					}
					if (flag == 1)
	 					break;	
				}
				if (flag == 1)
	 				break;
			}
		if(flag == 0)
		{
			System.out.println("The String is Unique");
	        }
	}
}
