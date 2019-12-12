import java.util.*;
public class SortedArrayToBST {

static class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
 }
     static Node root;
     public static void main(String[] arg)
     {
	   Scanner input=new Scanner(System.in);
	   SortedArrayToBST tree=new SortedArrayToBST();
	   int n,m;
	   System.out.println("Enter how much trees you want to build from ");
	   n=input.nextInt();
	   for(int i=0;i<n;i++)
	    {
		   System.out.println("\nEnter size of array");
		   m=input.nextInt();
		   int arr[]=new int[m];
		   System.out.print("Enter elements");
		   for(int j=0;j<m;j++)
		   {
	         arr[j]=input.nextInt();
		   }
		   root=tree.sortedArrayToBST(arr,0,m-1);
		   tree.preOrder(root);
	    }

      }

     public Node sortedArrayToBST(int a[],int m,int n)
     {
    	 if(m>n)
    		 return null;

    	 int mid=(m+n)/2;
    		Node root1=new Node(a[mid]);

    		root1.left= sortedArrayToBST(  a,m, mid-1);
    		root1.right= sortedArrayToBST(  a, mid+1,n);

        		 return root1;

     }

     public void preOrder(Node root)
     {
    	 if(root!=null)
    	 {
    		 System.out.print(root.data+" ");
    		 preOrder(root.left);
    		 preOrder(root.right);
    	 }
     }

  }
