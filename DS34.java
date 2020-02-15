import java.util.*;

public class LevelOrderPrinting {


static Node root;

LevelOrderPrinting ()
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

		static void levelorder(Node r) {

			int h=height(r);
			for(int i=1;i<=h;i++) {
				levelorderPrint(r,i);
			}
		}

		static int height(Node r) {

			if(r==null)
				return 0;
			int m=height(r.left);
			int n=height(r.right);

			if(m>n)
				return m+1;
			else
				return n+1;
		}

	static void levelorderPrint(Node r,int n) {

		if(r==null)return;
		if(n==1)
		{
			System.out.println(r.data);

		}
		if(n>1) {

			levelorderPrint(r.left, n-1);
			levelorderPrint(r.right, n-1);
		}

	}


public static void main (String arg[])
{
	Scanner sc=new Scanner(System.in);
	LevelOrderPrinting  tree=new LevelOrderPrinting ();
	System.out.println("Enter the size of array");
	int m=sc.nextInt();
	int arr[]=new int[m];
	System.out.println("Enter elements");


    for(int i=0;i<m;i++)
     {
      	arr[i]=sc.nextInt();
     	insert(arr[i]);

     }

	System.out.println("\nlevelorder");
    tree.levelorder(root);
  }
}
