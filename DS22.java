import java.util.*;
public class NodedelInTree {
	 static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d)
		{
			data=d;
			left=right=null;
		}
		
	}
	NodedelInTree(){
		root=null;
	}
	
	public static void insert(int d) {
		root=insrtitm(root,d);
	}
	
	 static Node insrtitm(Node root,int d)
	{
		if(root==null)
		{
			root=new Node(d);
			return root;
		}
		if(root.data>d)
			root.left=insrtitm(root.left,d);
		else
			root.right=insrtitm(root.right,d);
		
		return root;

	}
	 static void inorder(Node root)
		{
		 
		 if(root!=null)
		 {
			 inorder(root.left);
			 System.out.print(root.data+" ");
			 inorder(root.right);
		 }
		}
	 
	 static void lo(Node root)
		{
		 Queue q=new LinkedList();
		 q.add(root);
		 while(!q.isEmpty())
		 {
			 Node n=(Node)q.poll();
			System.out.print(n.data+" ");
			if(n.left!=null)
			{
				q.add(n.left);
			}
			if(n.right!=null)
			{
				q.add(n.right);
			}
				
		 }
		 
		}
	 
	
			
	
	public static void main(String arg[])
	{
		NodedelInTree tree=new  NodedelInTree();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want in tree");
		int n=sc.nextInt();
		System.out.println("Enter elements");

		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			insert(m);
		}
		

		
		System.out.print("\n");
		lo(root);
		System.out.print("\n");

		
		
	}

}
