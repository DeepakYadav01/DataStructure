import java.util.*;

public class ReverseKNodeLL {


	static Node head;
	static class Node{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
		}
	}

	static ReverseKNodeLL insert(ReverseKNodeLL r,int d) {

		Node newNode=new Node(d);
		newNode.next=null;

		if(r.head==null) {
			r.head=newNode;
		}
		else {

			Node last=r.head;
			while(last.next!=null) {

				last=last.next;

			}
			last.next=newNode;

		}

		return r;
	}


	static ReverseKNodeLL findKNodeRev(ReverseKNodeLL rkl,int k) {

		Node n1=rkl.head,n2=null, n3=head;
		while(k>1)
		{
			n1=n1.next;
			k--;
		}
		n2=n1.next;
		n1.next=null;

		Node rev=reverse(n3);
		Node rev1=reverse(n2);
		Node rev3=rev;
		rkl.head=rev;rkl.head=rev;
		while(rev3.next!=null) {
			rev3=rev3.next;
		}
		rev3.next=rev1;

		return rkl;
	}

	static Node reverse(Node n) {

		if(n==null)
			return n;
		else {
			Node cur=n;
			Node next=null;
			Node prev=null;
			while(cur!=null) {
				next=cur.next;
				cur.next=prev;
				prev=cur;
				cur=next;
			}
			n=prev;
		}

		return n;
	}


	static void display(Node r ) {

		while(r!=null) {
			System.out.print(r.data+" ");
			r=r.next;
		}

	}

	public static void main (String arg[]) {

		Scanner sc=new Scanner(System.in);
		ReverseKNodeLL r= new ReverseKNodeLL();
		System.out.println("Enter the size of LinkedList");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter  elements in LinkedList");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			insert(r,a[i]);

		}

		System.out .println("Enter value");

		int k=sc.nextInt();
		if(k<=n) {
			findKNodeRev(r,k);
			display(r.head);
		}
		else
			System.out.println("value should be less than or equal to size of LinkedList.");

	}
}
