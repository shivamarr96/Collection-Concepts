import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args) {
		MyArrayList<String> al=new MyArrayList<>(5);
		Iterator i=al.iterator();
		ArrayList<String> al1=new ArrayList<>();
		al1.add("dsdsds");
		al1.add("bhumika");
		al.add("hello");
		al.add("jhsd");
		al.add("hello");
		al.add("jhsd");
		al.add("hello");
		al.add("jhsd");
		al.addAll(al1);
		i.remove();
		System.out.println(al);
		System.out.println(al.size1());
		System.out.println(al.capacity());
		i.remove();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(al.size1());
		System.out.println(al.capacity());
	}
}
class MyArrayList<T> implements Iterator
{
	int size1;
	int index=-1;
	int next=0;
	Object objects[]; 
	float growth=0.5f;
	MyArrayList()
	{
size1=10;
objects=new Object[size1];
	}
	MyArrayList(int size1)
	{
		this.size1=size1;
	objects=new Object[size1];

	}
	public void add(T obj)
	{
	//System.out.println(obj.getClass().getName());
		if(index+1==size1)
		{
	Float f=(float)size1*growth;
	Integer in=f.intValue();
	int grow=in;		
	int tempsize=size1+in;
	Object tempobj[]=new Object[tempsize];
	size1=tempsize;
	for(int i=0;i<=index;i++)
	{
		tempobj[i]=objects[i];
	}
	
	objects=tempobj;
		}
		objects[++index]=obj;
	}
	public boolean set(int i,T obj)
	{
		if(i>index)
		{
			add(obj);
			return true;
		}
		else if(i<0)
		{
			return false;
		}
		else
		{
			objects[i]=obj;
			return true;
		}
	}
	public <Y extends Collection> void addAll(Y o)
	{

		for(int i=0;i<o;i++)
		{
			add(o.get(i));
		}
	}
	public String toString()
	{
		String str="{";
		for(int i=0;i<=index;i++)
		str=str+objects[i].toString()+" ";
	str=str+"}";
	return str;
	}
	public void remove()
	{
		index--;
	}
	public int size1()
	{
		return index+1;
	}
	public boolean isEmpty()
	{
		return (index==-1);
	}
	public int capacity()
	{
		return objects.length;
	}
	public Object next()
	{
		return objects[next++];
	}
	public boolean hasNext()
	{
		if(next>index)
			return false;
		else
			return true;

	}
	Iterator iterator()
	{
		return this;
	}
}