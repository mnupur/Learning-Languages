package Misc;

public class StackWithLinkedList {
   StackNode top = null;
   int data;
   public void push(int data)
   {
	   StackNode n = new StackNode(data);
	   n.next = top;
	   top = n;
   }
   public int pop()
   {
	   if(top == null)
	   {
		   System.out.println("Stack underflow");
		   return 0;
	   }
	   int item = top.data;
	   top = top.next;
	   return item;
   }
   public int peek()
   {
	   if(top == null)
	   {
		   System.out.println("Stack underflow");
		   return 0;
	   }
	   int item = top.data;
	   return item;
   }
   public boolean isEmpty()
   {
	   if(top == null)
		   return true;
	   return false;
   }
   public boolean search(int item)
   {
	   if(top == null)
		   return false;
	   StackNode n = top;
	   while(n.next != null)
	   {
		   if(n.data == item)
			   return true;
		   n = n.next;
	   }
	   return false;
   }   
}
