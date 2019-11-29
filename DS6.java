
//infix to postfix

package QueuePrtc;
import java.util.*;
public class OrderOfOperation {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the infix expression");

		String s,s1="";
		int count=0,k=0;
		s= sc.next();

		Stack stk=new Stack();
		Queue q = null;
		char ch[]=s.toCharArray();
		int l=ch.length;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='+'||ch[i]=='-'||ch[i]=='*'||ch[i]=='/')
			{
				stk.push(ch[i]);
//				((Stack) q).push(ch[i]);
			}
			else
			{
				++count;
				s1=s1+ch[i];
			}

			if(count==2)
			{
				while(!stk.isEmpty())
				s1=s1+stk.pop();

				count=0;
			}
		}
		int l1=s1.length();
		if(l==l1)
		System.out.print(s1);
		else
			System.out.print(s1+stk.pop());


//		System.out.print(q.poll());
   	}
	}
