import java.util.*;

public class SumLinkedList {


	static Node head;
	static class Node{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
		}
	}


	static SumLinkedList insert(SumLinkedList r,int d) {

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


static int  sumList(Node n ) {


		Node h=n;
		int t=0;
		while(h!=null) {
			t=t*10+h.data;
			h=h.next;
		}

		return t;
	}



	static void display(SumLinkedList r ) {

		while(r.head!=null) {
			System.out.print(r.head.data+" ");
			r.head=r.head.next;
		}
	}

	public static void main (String arg[]) {

		Scanner sc=new Scanner(System.in);
		SumLinkedList r= new SumLinkedList();
		SumLinkedList r1= new SumLinkedList();



		System.out.println("Enter the testcases");
		int n=sc.nextInt();

		for(int i=0;i<n;i++) {
			System.out.println("Enter length of first linkedlist");
			int m=sc.nextInt();
			int a[]=new int[m];
			System.out.println("Enter elements of first Linkedlist");

			for(int j=0;j<m;j++ ) {
				a[j]=sc.nextInt();
				insert(r,a[j]);
			}

			int t=sumList(r.head);
			head=null;

			System.out.println("Enter length of second linkedlist");
			int m1=sc.nextInt();
			int a1[]=new int[m1];
			System.out.println("Enter elements of second Linkedlist");


			for(int j=0;j<m1;j++ ) {
				a1[j]=sc.nextInt();
				insert(r,a1[j]);
			}


			int t1=sumList(r.head);
			int sum=t+t1;
			head=null;

			while(sum>0) {
				int mod=sum%10;
				insert(r1,mod);
				sum=sum/10;
			}

			display(r1);
			System.out.print("\n");

		}


	}
}
