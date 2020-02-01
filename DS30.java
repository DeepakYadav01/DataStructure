import java.util.*;

public class GetMinStack {

	static Node top;
	static class Node
	{
	int data;
	Node next;
	Node(int d)
	{
	data=d;
	next=null;
	}
	}

	public void push(int data)
	{
	Node node = new Node(data);

	if (node == null)
	{
	  System.out.print("overstack");
	  return;
	}

	node.next = top;
    top = node;
	}

	public void display()
	{
		if(top==null)
		{
			System.out.print("Stack is empty now\n");
		}
		else {
			Node cloneTop=top;
			System.out.print("displaying stack elements : ");

			while(cloneTop!=null) {
				System.out.print(cloneTop.data+" ");
                cloneTop=cloneTop.next;
			}
			System.out.println("\n");
		}
	}

	public void getMin()
	{

	if (top == null)
	{
	System.out.print("Currently,No element is present in the stack.");
	return;
	}

	else {

		Node cloneTop=top;
		int min=cloneTop.data;
		while(cloneTop!=null){

			if(cloneTop.data<min) {
				min=cloneTop.data;
			}
			cloneTop=cloneTop.next;

		}
		System.out.println("Minimum element from stack is:"+min);

	  }

	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		GetMinStack  stack = new GetMinStack ();
		System.out.println("Enetr the size of Stack");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enetr elements in Stack");
		for(int i=0;i<n;i++) {

			a[i]=sc.nextInt();
			stack.push(a[i]);

		}

     stack.display();
	stack.getMin();


	}

}
