import java.util.*;
class Link
{
	int idata;
	Link next;
	public Link(int id)
	{
		idata=id;

	}
	public String toString()
	{
		return "{"+idata+"}";
	}
}
class LinkList
{
	private Link first;
	public LinkList()
	{
		first=null;
	}
	public boolean isEmpty()
{
return first==null;
}
public void insertFirst(int id)
{
Link nl=new Link(id);
nl.next=first;
first=nl;
}
public Link deleteFirst()
{
	Link temp=first;
	first=first.next;
	return temp;
}
public String toString()
{
	Link current=first;
	String str="";
	while(current!=null)
	{
		str=str+current.toString()+"  ";
		current=current.next;
	}
	if(str.trim().equals(""))
		return "null";
	else
return str;

}
public Link find(int key)
{
Link current=first;
while(current.idata!=key)
{
	if(current.next==null)
		{return null;}
	else
	{
current=current.next;
	}
}
return current;
}
public Link delete(int key)
{
	Link current=first,previous=first;
	while(current.idata!=key)
	{
		if(current.next==null)
		{
			return null;
		}
		else
		{
			previous=current;
			current=current.next;
		}
	}
	if(current==first)
	{
		current=current.next;
	}
	else
	{
		previous.next=current.next;
	}
	return current;
}
public void clear()
{
	while(!isEmpty())
	{
		deleteFirst();
	}
}
}
class LinkedListDemo
{
	public static void main(String[] args) {
		LinkList ll=new LinkList();
		ll.insertFirst(44);
		ll.insertFirst(22);
		ll.insertFirst(11);
		ll.insertFirst(88);
		ll.insertFirst(11);
		System.out.println(ll);
		ll.deleteFirst();
		System.out.println(ll);
		System.out.println(ll.find(22));
		System.out.println(ll.delete(11));
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
	}
}