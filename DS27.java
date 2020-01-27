import java.util.*;
public class InToPreandPost {

	static Node root;
	static class  Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}

	}
	static int  e=0;

	static Node buildTree(Node root,int a[],int s,int l) {

		if(s>l)
			return root;
	  int mid=(s+l)/2;
	root=new Node(a[mid]);

	 root.left= buildTree(root.left,a,s,mid-1 );
	 root.right= buildTree(root.right,a,mid+1,l );

		return root;
	}
	public static  void preorder(Node root) {

		if(root!=null) {
			System.out.println(root.data);
			preorder( root.left);
			preorder( root.right);
		}
	}


	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of array in ascending order");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		root=buildTree(root,a,0,n-1);

	preorder(root);


	}
}
