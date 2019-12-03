package LinkedList;

import java.util.*;


public class LLusinRecrnc {
	static Node head;
	public static class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;
			//next=null;

		}
	}
	public static LLusinRecrnc  insert(LLusinRecrnc li,int data) {

		Node n=new Node(data);
	n.next=null;
		if(li.head==null) {
			li.head=n;

		}
		else {
			Node last = li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;

		}


		return li;
	}

	public static void  display1( Node head)
	{
		Node current =head;
		System.out.print("Linkedlist\n");

		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print("\n");
	}

	public static void  display( Node head)
	{
		Node current =head;

		current=head;

		if(current==null)
		{
			System.out.print("Linkedlist in reverse order\n");

			return ;
		}
		else
			 display(current.next);
		System.out.print(current.data+" ");
	}


	public static void main(String arg[])
	{

		LLusinRecrnc li=new LLusinRecrnc();
		li.insert(li, 10);
		li.insert(li, 20);
		li.insert(li, 30);
		li.insert(li, 40);
		li.insert(li, 50);

		li.display1(head);
		li.display(head);

	}

}
