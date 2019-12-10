import java.util.*;
public class InsrtnodeMidleOfLL {
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
	static int count=0;
	public static InsrtnodeMidleOfLL  insert(InsrtnodeMidleOfLL  li,int data) {
		count++;
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




public static InsrtnodeMidleOfLL  insert1(InsrtnodeMidleOfLL  li,int c,int c1) {

	Node newNode=new Node(c);
	newNode.next=null;

   if(li.head==null)
   {
	   li.head=newNode;
	   return li;

   }
   else {
	   Node prev=null;
	   int count1=0;

	 if(c1%2==0)
	   {
		  int mid=c1/2;
	      Node current=li.head;
         while(current!=null)
         {
	       if(count1==mid)
	      {
		   prev.next=newNode;
		   newNode.next=current;
		   current=current;
		   count1++;
	      }
	   else {
		   prev=current;
		   current=current.next;
		   count1++;
	      }
         }

       }
	 else {

		  int mid=c1/2;
	      Node current=li.head;
         while(current!=null)
         {
	       if(count1==mid+1)
	      {
	    	   prev.next=newNode;
			   newNode.next=current;
			   current=current;
			   count1++;
	      }
	   else {
		   prev=current;
		   current=current.next;
		   count1++;
	      }
         }
	 }
   }


	return li;
}


	public static InsrtnodeMidleOfLL  display( InsrtnodeMidleOfLL li)
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
		InsrtnodeMidleOfLL li=new InsrtnodeMidleOfLL ();
		System.out.println("Enter elements");


       for(int i=0;i<m;i++)
        {
         	arr[i]=sc.nextInt();
        	li.insert(li, arr[i]);
        }

        System.out.println(count);

        System.out.println("LinkedList is");
		li.display(li);

	    System.out.println("\nEnter element you want to insert middle of LL");

        int elmnt=sc.nextInt();

        insert1(li,elmnt,count);
	    System.out.println("After inserting element at middle of LL");

 		li.display(li);

   }
}
