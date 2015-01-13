//Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?

import java.util.*;

public class StringUnique1{
	public static void main(String[] args)
	{
		String s = null;
		boolean result = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		s = in.nextLine();
		result = isUniqueString(s);
                if (result == false)
		{
			System.out.println("String is not Unique");
		}
		else
		{
			System.out.println("String is Unique");
		}
	}
        public static boolean isUniqueString(String s)
        {
		boolean[] char_arr = new boolean[256];
		for(int i = 0; i<s.length(); i++)
		{
			int b = s.charAt(i);
			if(char_arr[b]) return false;
			char_arr[b] = true;
		}
		return true;
	}
}
