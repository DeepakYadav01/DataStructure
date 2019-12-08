import java.util.*;

import BST.Node;

public class LeftViewBst {

static Node root;

LeftViewBst ()
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
	static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	return ;
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

	static int m=0;
	static void leftView(Node r,int n) {

		if(r==null)return;
		if(m<n)
		{
			System.out.println(r.data);
			m=n;
		}
		leftView( r.left, n+1);
		leftView( r.right, n+1);
	}


public static void main (String arg[])
{
	Scanner sc=new Scanner(System.in);
	LeftViewBst  tree=new LeftViewBst ();
	System.out.println("Enter the size of array");
	int m=sc.nextInt();
	int arr[]=new int[m];
	System.out.println("Enter elements");


    for(int i=0;i<m;i++)
     {
      	arr[i]=sc.nextInt();
     	insert(arr[i]);

     }

	System.out.println("\nleftView printing");
    tree.leftView(root,1);
  }
}
