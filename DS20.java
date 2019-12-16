import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class BottomView {

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
	BottomView(){
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
	 public static void topv(Node r,int l)
	 {
		 class cQueue{
			 Node n;
			 int l;
			 cQueue(Node n1,int l1)
			 {
				 n=n1;
				 l=l1;
			 }

		 }
		 Queue q=new  LinkedList();
		 Map<Integer,Node> m=new TreeMap<Integer,Node>();
		 q.add(new cQueue(root,0));

		 while(!q.isEmpty())
		 {
			 cQueue q1=(cQueue)q.poll();

			 if(!m.containsKey(q1.l))
			 {
				 m.put(q1.l, q1.n);
			 }
			 else {
				 m.put(q1.l, q1.n);
			 }
			 if(q1.n.left!=null)
			 {
				 q.add(new cQueue(q1.n.left,q1.l-1));
			 }
			 if(q1.n.right!=null)
			 {
				 q.add(new cQueue(q1.n.right,q1.l+1));
			 }
		 }

		 for (Integer entry : m.keySet()) {
	            System.out.print(m.get(entry).data);
	        }
	 }



		public static void main(String arg[])
		{
			TV tree=new  TV();
			Scanner sc=new Scanner(System.in);
			System.out.println("How many elements you want in tree");
			int n=sc.nextInt();
			System.out.println("Enter elements");

			for(int i=0;i<n;i++)
			{
				int m=sc.nextInt();
				insert(m);
			}

			topv(root,0);
		}
}
