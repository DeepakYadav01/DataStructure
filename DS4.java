import java.util.*;

public class DeleteDuplctLL {
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
	public static DeleteDuplctLL   insert(DeleteDuplctLL  li,int data) {

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

	public static DeleteDuplctLL DelDuplicate( DeleteDuplctLL  li)
	{


		Node prev=null,cur=li.head,cur1=li.head.next;

	 if(cur==null)
		{
		  return li;
		}
		else if(cur1==null)
		{
			return li;
		}
	 else {
		while(cur!=null)
		{
			prev=cur;
			cur1=cur.next;
			while(cur1!=null)
			{
				if(cur.data==cur1.data)
				{
					prev.next=cur1.next;
							cur1=cur1.next;
				}
				else
				{
					prev=cur1;
					cur1=cur1.next;
				}
			}
			cur=cur.next;

   		}

	  }
	 return li ;

	}


	public static DeleteDuplctLL  display( DeleteDuplctLL  li)
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
		DeleteDuplctLL  li=new DeleteDuplctLL ();
		System.out.println("Enter elements");


       for(int i=0;i<m;i++)
        {
         	arr[i]=sc.nextInt();
        	li.insert(li, arr[i]);

        }
   	System.out.println("Before deletion of duplicate elements from  LinedList");

       li.display(li);

	li.DelDuplicate(li);
	System.out.println("\nAfter deletion of duplicate elements from unsorted LinedList");
	li.display(li);

   }
}
