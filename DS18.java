import java.util.*;
public class StackUsingInstnceOfQueue {
   static class Stack{
	   static Queue<Integer>q1=new LinkedList<Integer>();
	   static Queue<Integer>q2=new LinkedList<Integer>();

	   static int curr_size;
	   Stack(){
		   curr_size=0;
	   }

	  public void push(int val)
	  {
		  curr_size++;
		  q1.add(val);
	  }

	  public int top()
	  {   int l=q1.size();
		  int a[]=new int[l];
		  for(int i=l-1;i>=0;i--)
		  {
			  a[i]=(int)q1.poll();
		  }
		  for(int i=0;i<l;i++)
		  {
			  q2.add(a[i]);
		  }
		 return q2.peek();
	  }

	  public void  pop()
	  {
	     q2.poll();
	  }

	  public int size()
	  {
		  if(q2.size()==0)
			 return curr_size;
		  else
		    return q2.size();
	  }

	   public static void main (String arg[])
	   {
		   Scanner sc=new Scanner(System.in);
		   Stack s=new Stack();
		   int n=sc.nextInt();
		   for(int i=0;i<n;i++)
		   {
			   int value=sc.nextInt();
			   s.push(value);
		   }
		   int m=sc.nextInt();
		   for(int i=0;i<m;i++)
		   {
			   System.out.println(s.top());
			   s.pop();
		   }
		   System.out.println(s.size());
	   }
   }
}
