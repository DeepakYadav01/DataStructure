import java.util.*;

public class RemoveDuplicateLL {

	static Node head;
	static class Node{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
		}
	}


	static RemoveDuplicateLL insert(RemoveDuplicateLL r,int d) {

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


	static RemoveDuplicateLL removeDuplicate(RemoveDuplicateLL r ) {

		Node current=r.head;
		Node prev=null;
		if(r.head==null) {
			return r;
		}
		else {

			while(current.next!=null) {

				if(current.data==current.next.data) {

					current.next=current.next.next;
				}
				else {

					prev=current;
					current=current.next;
				}
			}

		}
		return r;

	}


	static void display(RemoveDuplicateLL r ) {

		while(r.head!=null) {
			System.out.print(r.head.data+" ");
			r.head=r.head.next;
		}
	}

	public static void main (String arg[]) {

		Scanner sc=new Scanner(System.in);
		RemoveDuplicateLL r= new RemoveDuplicateLL();
		System.out.println("Enter the size of LinkedList");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter  elements in LinkedList");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			insert(r,a[i]);

		}

		removeDuplicate(r);
		display(r);
	}
}
