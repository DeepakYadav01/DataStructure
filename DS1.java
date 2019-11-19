import java.util.*;


public class LinkedListRotation {

	Node head;
	public static class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;


		}
	}
	public static LinkedListRotation   insert(LinkedListRotation  li,int data) {

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

	public static LinkedListRotation  Rotation( LinkedListRotation  li,int inpt)
	{

		Node cur=null,current=li.head;
		if(current==null)
		{

		  return li;
		}
		else if(current.next==null)
		{
			return li;
		}
		else {
		while(inpt>0)
		{
			while(current.next!=null)
			{
				cur=current;
				current=current.next;
			}
			cur.next=null;
			current.next=li.head;
			li.head=current;
			inpt--;

		}
		return li;

	   }
	}



	public static LinkedListRotation  display( LinkedListRotation  li)
	{
		Node current =li.head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}

		return li;
	}


	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int m=sc.nextInt();
		int arr[]=new int[m];
		LinkedListRotation  li=new LinkedListRotation ();
		System.out.println("Enter elements");


       for(int i=0;i<m;i++)
        {
         	arr[i]=sc.nextInt();
        	li.insert(li, arr[i]);

        }

     System.out.println("Before Rotation");

		li.display(li);


		System.out.println("\nEnter, how many time you want to rotate the list");
		int inpt=sc.nextInt();

	li.Rotation(li,inpt);
	System.out.println("After Rotation");
	li.display(li);

   }
}
