package BinaryTree;
public class BTreePractise {

	static Node root;

	BTreePractise()
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

	static void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}

	}

	static void postorder(Node root)
	{
		if(root!=null)
		{

			preorder(root.left);
			preorder(root.right);
			System.out.println(root.data);



		}

	}



public static void main (String arg[])
{

	BTreePractise tree=new BTreePractise();

	tree.root =new Node(10);

	tree.root.left =new Node(20);
	tree.root.right =new Node(30);

	tree.root.left.left =new Node(40);
	tree.root.left.right =new Node(50);
	System.out.println(" Inorder Tree");
	inorder(root);
	System.out.println("\n Preorder Tree");
	preorder(root);
	System.out.println(" Postorder Tree");
	postorder(root);


      }
	}
