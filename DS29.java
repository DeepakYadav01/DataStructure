import java.util.*;

public class PairInDll {

	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;

		Node(int d)
		{data=d;}
	}
	public static PairInDll  insert(PairInDll li, int data)
	{

        Node temp=null;
		Node newNode=new Node(data);
		newNode.prev=null;
		newNode.next=null;


		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			temp=last;
			last.next=newNode;
			newNode.prev=last;
		}
	return li;
	}

	public static void findPair(PairInDll dli, int value) {

		Node n=dli.head.next;
		while(dli.head!=null)
		{

			if(n!=null) {
				if(dli.head.data+n.data==value) {
					System.out.print("("+n.data+","+dli.head.data+")");
				}
			}

			 if(n==null) {

				 dli.head=dli.head.next;
				    if(dli.head==null)
				    	break;
				    else
				       n=dli.head.next;
			}
			else {
				n=n.next;
			}
		}

	}



	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		PairInDll pdll=new PairInDll();
		System.out .println("Enter the size of DoubluLL");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out .println("Enter elements in DoubluLL");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			insert(pdll,a[i]);

		}

		System.out .println("Enter the value whose pair you want to find");

		int m=sc.nextInt();
		findPair(pdll,m);


	}

}
