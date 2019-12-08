import java.util.*;
public class LeafNode {

	static Node root;

	LeafNode  ()
		{
			root=null;
		}

		static class Node
		{
		int data ;
		Node left,right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
		}

		static void insert(int data)
		{
			root=insertitem(root,data);

		}

			public static Node insertitem(Node root,int data)
			{
				if(root==null)
				{
					root=new Node(data);
					return root;

				}
				else if(root.data>data)
				{
					root.left=insertitem(root.left,data);
				}
				else
				{
					root.right=insertitem(root.right,data);
				}

		return root;
			}

		static void  LF(Node r) {

			 if(r.left==null&&r.right==null)
				{
				  System.out.println(r.data);
				}

			 if(r.left!=null)
				  LF( r.left);
				 if(r.right!=null)
				  LF( r.right);

		}


	public static void main (String arg[])
	{
		Scanner sc=new Scanner(System.in);
		LeafNode  tree=new  LeafNode   ();
		System.out.println("Enter the size of array");
		int m=sc.nextInt();
		int arr[]=new int[m];
		System.out.println("Enter elements");

	    for(int i=0;i<m;i++)
	     {
	      	arr[i]=sc.nextInt();
	     	insert(arr[i]);

	     }

		System.out.println("\nLeafNodes printing");
	     LF(root);
	  }
}
