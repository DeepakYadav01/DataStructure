import java.util.*;
public class NodeDeletionOfBST {

	static Node root;
   public static class Node{
	   int data;
	   Node right,left;
	   Node(int d)
	   {
		   data =d;
		   left=right=null;
	   }

   }
   public static Node insert(Node r,int d ) {

	   if(r==null)
	   {
		   r=new Node(d);
		   return r;
	   }
	   if(d>r.data)
	   {
		r.right= insert(r.right,d);
	   }
	   else
	   {
		r.left=insert(r.left,d);
	   }
	   return r;
   }
 public static void  display(Node r) {

	if(r!=null)
	{
		display(r.left);
		System.out.print(r.data+" ");
		display(r.right);
	}
   }

 static Node delNode(Node root, int ele)
 {

     if (root == null)  return root;

     if (ele < root.data)
         root.left = delNode(root.left, ele);
     else if (ele > root.data)
         root.right = delNode(root.right, ele);

     else
     {
      if(root.left==null&&root.right==null)
    	  return null;
         if (root.left == null)
             return root.right;
         else if (root.right == null)
             return root.left;
         else {
         root.data = maxLeft(root.left);

         root.left = delNode(root.left, root.data);
       }
     }

     return root;
 }

 static int maxLeft(Node root)
 {
	 if(root.right!=null)
    maxLeft(root.right);
    return root.data;
 }

	   public static void main(String arg[])
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter how many elements you want in tree");
		   int n=sc.nextInt();
		   for(int i=0;i<n;i++)
		   {
			   int m=sc.nextInt();
			root= insert(root,m);

		   }
		   display(root);
		   System.out.println("\nEnter the element you want to delete");
		   int ele=sc.nextInt();
		   root=delNode(root,ele);
		   display(root);

	   }

}
