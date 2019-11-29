package QueuePrtc;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the expression in prefix");

		String s,s1="";
		int count=0,k=0;
		int j=0;
		s= sc.next();

		Stack stk=new Stack();

		char ch[]=s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='+'||ch[i]=='-'||ch[i]=='*'||ch[i]=='/')
			{
				stk.push(ch[i]);
			}

			else
			{
				++count;
               System.out.print(ch[i]);

			}

			if(count==1)
			{
				if(!stk.isEmpty())
				System.out.print(stk.pop());
				count=0;
			}

		}
	}
}
