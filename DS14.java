import java.util.*;
public class StkUsingQue {

	static Node front;
	static Node rear;

	StkUsingQue()
	{
		front=rear=null;
	}
	static class Node {

		int data;
		Node next;
		Node(int d)
		{
			data=d;
            next=null;
		}
	}

	void enqueue(int d)
	{
		Node n=new Node(d);
		if(rear==null) {
			rear=n;
			front=n;
		}
		else {

			rear=n;
			n.next=front;
			front=n;
		}
	}

	void dequeue()
	{
		if(front==null)
			return;
		else
		{

			while(front!=null)
			{
				System.out.println(front.data);
				front=front.next;
			}
		}
	}

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of queue");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");

		StkUsingQue sq=new StkUsingQue();

		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sq.enqueue(a[i]);
		}

		System.out.println("Stack using queue ");

		sq.dequeue();
	}

}
