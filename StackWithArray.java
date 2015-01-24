package Misc;

public class StackWithArray {
	int top;
	int[] stack;
	StackWithArray(int capacity)
	{
		if(capacity <= 0)
			System.out.println("Capacity cannot be negetive");
		stack = new int[capacity];
		top = -1;
	}
	void push(int data)
	{
		if(top == stack.length)
			System.out.println("Stack overflow");
		top++;
		stack[top] = data;
	}
	int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
		    return 0;	
	    }
		int data = stack[top];
		stack[top] = 0;
		top --;
		return data;
	}
	int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack Empty");
		    return 0;	
		}
		return stack[top];
	}
	boolean search(int data)
	{
		if(top == -1)
			return false;
		else
		{
		    for(int i =0; i<stack.length; i++)
		    {
		    	if(stack[i] == data)
		    		return true;
		    }
		    return false;
		}
	}
	boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	}
}
