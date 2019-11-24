import java.util.*;
public class ReverseDLL {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;

		Node(int d)
		{data=d;}
	}

	public static ReverseDLL  insert(ReverseDLL li, int data)
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

	public static ReverseDLL  Reverse(ReverseDLL  li)
	{
		if(li.head!=null)
		{
		  Node next=null;
		  Node cur=li.head;
		  Node prev=null;

		  while(cur!=null)
		  {
			  next=cur.next;
			  cur.next=prev;
			  prev=cur;
			  cur=next;
		  }
		li.head=prev;

		}
		return li;

	}
	public static void display(ReverseDLL  li)
	{
		   Node temp=li.head;
		   while(temp!=null)
		   {
			   System.out.print(temp.data+" ");

			   temp=temp.next;
		   }

	}

	public static void main(String[] args)
	{
		ReverseDLL  li=new ReverseDLL ();
		Scanner sc=new Scanner(System.in);

                System.out.println("Enter size of LL");
                int n=sc.nextInt();
                System.out.println("Enter elements");

                for(int i=0;i<n;i++)
                {
                    int el=sc.nextInt();
                    insert(li,el);
                }

                li.Reverse(li);
                System.out.println("Reversed LinkedList");
                li.display(li);


   	}
}
