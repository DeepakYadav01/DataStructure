package LinkedList;

import java.util.Scanner;


public class KeyValue {

	Node head;
	public static class Node
	{
		int data;
		String sdata;
		Node next;

		Node(int d,String s)
		{
			data=d;
			sdata=s;
			//next=null;

		}
	}
	public static KeyValue  insert(KeyValue li,int data,String s) {

		Node n=new Node(data,s);
	n.next=null;
		if(li.head==null) {
			li.head=n;

		}
		else {
			Node last = li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;

		}


		return li;
	}


	public static  KeyValue  DeleteByIndex( KeyValue li,int indx) {

		Node current=li.head,prev=null;

		if(indx==0 && current!=null)
		{
			li.head=current.next;

			System.out.println("Your element is deleted from index - "+indx);
			return li;
		}

		int count=0;
		while(current!=null)
		{
			if(count==indx)
			{
			prev.next=current.next;
			System.out.println("Your element is deleted from index - "+indx);
break;
			}
			else {
				prev=current;
				current=current.next;
				count++;
			}
		}

		if(current==null)
		{
			System.out.println("This index is not available in the LinkedList");

		}
		return li;

	}
public static  KeyValue  DeleteBykey( KeyValue li,int k) {

		Node current=li.head,prev=null;
		if(current==null)
			return li;
		else if(current.data==k)
		{
			current=current.next;
			return li;
		}
		else {
		while(current!=null) {
		if(current.data==k )
		{
			prev.next=current.next;


			System.out.println("Your node is deleted ");
			return li;
		}
		else
		{

		prev=current;
			current=current.next;

		  }
	    }
	 }
		return li;
}

public static  KeyValue  DeleteByvalue( KeyValue li,String str) {

	Node current=li.head,prev=null;
	if(current==null)
		return li;
	else if(current.sdata.equals(str))
	{
		li.head=current.next;
	}
	else {
	while(current!=null) {
	if(current.sdata.equals(str) )
	{
		prev.next=current.next;


		System.out.println("Your node is deleted ");
		return li;
	}
	else
	{

	prev=current;
		current=current.next;

	  }
    }
 }
	return li;
}


public static  KeyValue  DeleteBykeypair( KeyValue li,int k,String s) {


	Node current=li.head,prev=null;
	if(current==null  )
		return li;

		 if(current.sdata.equals(s) ) {
		System.out.println("hello");
		li.head=current.next;
		 }

	 else {
	while(current!=null) {


	if(current.data==k && current.sdata.equals(s)  )
	{
		prev.next=current.next;


		System.out.println("Your node is deleted ");
		return li;
	}
	else
	{

	prev=current;
		current=current.next;

	}
  }
}
	return li;
}



	public static KeyValue display( KeyValue li)
	{
		Node current =li.head;
		while(current!=null)
		{
			System.out.println(current.data+" "+current.sdata);
			current=current.next;
		}

		System.out.println(current);
		return li;
	}



	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		KeyValue li=new KeyValue();
		System.out.println("How many keyvalue you want to enter,please enter in umber");
		int m,n=sc.nextInt();
		String st;

		for(int i=0;i<n;i++)
		{
			System.out.println("enter key");
			m=sc.nextInt();
			System.out.println("enter value of key");

			st=sc.next();

			li.insert(li, m,st);

		}



		li.display(li);

		char s1='y';
 while(s1=='y' )
 {
		System.out.println("1.Do you want to delete using index");
		System.out.println("2.Do you want to delete using key ");
		System.out.println("3.Do you want to delete using value ");
		System.out.println("4.Do you want to delete using key pair");

		System.out.println("Enter your choice");
int t=sc.nextInt();
switch(t) {
case 1:
	System.out.println("Enter  index at which you want to delete the element");
	int indx=sc.nextInt();

	li.DeleteByIndex(li,indx);
	li.display(li);
	break;
case 2:
	System.out.println("Enter  key  ");
	int key=sc.nextInt();
	li.DeleteBykey(li,key);
	li.display(li);
	break;
case 3:
	System.out.println("Enter  value ,should be in string ");
	String str=sc.next();
	li.DeleteByvalue(li,str);
	li.display(li);
	break;
case 4:
	System.out.println("Enter  key  ");
	 key=sc.nextInt();
	System.out.println("Enter  value which should be  String ");
    String s2=sc.next();
	li. DeleteBykeypair(li,key,s2);
	li.display(li);
	break;
default:
	System.out.println("Enter a valid no.");
	break;
  }
System.out.println("\nDo you want to cotinue: yes/no");
s1=sc.next().charAt(0);
    }
  }
}
