import java.util.Scanner;
import java.util.*;

public class QUsingTwoStack {
	static Node top;
	static Stack s=new Stack();
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;

		}

	}
	static boolean isEmpty(Node t) {

		return t==null;
	}
	static void  Push(Node t,int d)
	{
		Node n=new Node(d);

		if(n==null)
			System.out.println("Stack is overflow");
		n.next=top;
		top=n;

	}

	static void  Pop(Node t)
	{
		if(isEmpty(t))
		{
			System.out.println("stack is empty");
		}

			while(t!=null)
			{
				s.push(t.data);
				t=t.next;
			}

			System.out.println("Elements of queue using two stack");

			while(!s.isEmpty())
			{
				System.out.println(s.pop());
			}

	}


   public static void main(String arg[])
   {
	   QUsingTwoStack q=new QUsingTwoStack();
	   Scanner sc=new Scanner(System.in);
	   int n,e;
		System.out.println("Enter size of Stack");
		n=sc.nextInt();
		System.out.println("Enter element to be inserted in stack");

		for(int i=0;i<n;i++)
		{
			e=sc.nextInt();
			 q.Push(top,e);
		}

		 q.Pop(top);


   }
}
