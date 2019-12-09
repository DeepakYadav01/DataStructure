package priorityqueue;
import java.util.*;
public class ExamplePQ {

	static Node front ;
	static Node rear;
	ExamplePQ ()
	{
		front=rear=null;
	}
	static class Node
	{

		int data;
	  int priority;
	  Node next;
		Node(int d)
		{
			data=d;
			priority = data;

		}
	}

	static void add(Node r,int d)
	{
		Node n=new Node(d);
		n.next=null;
		if(rear==null)
		{
			rear=n;
			front=n;
		}
		else {
			Node l=r;
			while(l.next!=null)
			{
				l=l.next;
			}
			l.next=n;
//			r.next = n;
//			r = r.next;
		}



	}

	static void remove(Node r,int d)
	{
		Node n=new Node(d);
		n.next=null;
		if(rear==null)
		{
			rear=n;
			front=n;
		}
		else {
			Node l=r;
			while(l.next!=null)
			{
				l=l.next;
			}
			l.next=n;
//			r.next = n;
//			r = r.next;
		}



	}


	static void display(Node h)
	{
		int count=0;
		Node current=h;
		System.out.println("elments are");
		while(current.next!=null)
		{
			++count;
	     System.out.print(current.data+" ");
	     current=current.next;
		}
		System.out.print("\n");
		current=h;
		int a[]=new int[count];
		for(int i=0;i<count;i++)
		{
			a[i]=current.data;
			current=current.next;
		}
		int temp=0;
		for(int i=0;i<count;i++)
		{
			temp=0;
			for(int j=i+1;j<count;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}

		}


		for(int i=0;i<count;i++)
		{
			System.out.print(a[i]+" ");
		}




	}

	public static void main(String arg[])
	{
		ExamplePQ pq=new ExamplePQ();
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the element");
//		int n=sc.nextInt();
		pq.add(rear,1);
		pq.add(rear,80);
		pq.add(rear,3);
		pq.add(rear,45);
		pq.add(rear,55);
		pq.add(rear,6);

		pq.display(front);
//		pq.remove(front);


	}


}
