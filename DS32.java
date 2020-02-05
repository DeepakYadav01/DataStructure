import java.util.Scanner;

public class MergingPointOfTwoLL {

	Node head,head1=null;
	public static class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;

		}
	}
	public static MergingPointOfTwoLL   insert(MergingPointOfTwoLL  li,int data) {

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

public static MergingPointOfTwoLL   insert1(MergingPointOfTwoLL  li1,int data) {

		Node n=new Node(data);
	n.next=null;
		if(li1.head1==null) {
			li1.head1=n;

		}
		else {
			Node last = li1.head1;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;

		}


		return li1;
	}



	public static MergingPointOfTwoLL mergeLL(MergingPointOfTwoLL n,MergingPointOfTwoLL n1,int c)
	{

		int count=0;
		Node node=n.head;
		while(node!=null) {
			count++;
			node=node.next;
		}
		if(c<count) {

		Node nd=n.head,nd1=n1.head1;
		while(c>0) {
			nd=nd.next;
			c--;
		}

		while(nd1.next!=null)
			nd1=nd1.next;

		nd1.next=nd;
		}

		return n1;
	}

	public static void display(Node n)
	{
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;

		}
		System.out.println("\n");
	}

	public static void findMergingPoint(Node n ,Node n1)
	{
		Node nd=n;
		int c=0;
		while(n1!=null) {
			while(nd!=null) {
				if(n1.data==nd.data) {
					System.out.println("Merging Point : "+n1.data);
	               c=1;
					break;
				}
				nd=nd.next;
			}
			if(c==1) {
				break;
			}
			else {
				n1=n1.next;
				nd=n;
			}

		}
		if(n1==null)
			System.out.print("There is no merging point");
	}

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first LL");
		int m=sc.nextInt();
		int arr[]=new int[m];
		MergingPointOfTwoLL  li=new MergingPointOfTwoLL();
		System.out.println("Enter elements");


       for(int i=0;i<m;i++)
        {
         	arr[i]=sc.nextInt();
        	li.insert(li, arr[i]);

        }
   	System.out.println("Enter the size of 2nd LL");
	int m1=sc.nextInt();
	int arr1[]=new int[m1];
	MergingPointOfTwoLL  li1=new MergingPointOfTwoLL();
	System.out.println("Enter elements");


   for(int i=0;i<m1;i++)
    {
     	arr1[i]=sc.nextInt();
    	li1.insert1(li1, arr1[i]);

    }

	System.out.println("Enter position where you want to merge 2nd LL in first LL");

	int pos=sc.nextInt();

       mergeLL(li,li1,pos);
       System.out.println("elements of first LL");
       display(li.head);
       System.out.println("elements of Second LL after merging into first");
       display(li1.head1);
      findMergingPoint(li.head,li1.head1);


   }
}
