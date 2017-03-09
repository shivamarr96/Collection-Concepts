import java.util.*;
import java.util.concurrent.*;
public class CollectionsDemo
{
	public static void main(String[] args)throws Exception {
		Set<String> myMap=new CopyOnWriteArraySet<>();
		myMap.add("one");
		myMap.add("dsd");
		myMap.add("dssda");
		myMap.add("ada");
		myMap.add("adadadad");
		System.out.println("CopyOnWriteArraySet before iterator:"+myMap);
		Iterator<String> i=myMap.iterator();
		while(i.hasNext())
		{
			String temp=i.next();
			if(temp.equals("ada"))myMap.add("New York");
		}
System.out.println("CopyOnWriteArraySet after iterator:"+myMap);
		ArrayList myList=new ArrayList();
		myList.add("one");
		myList.add("dsd");
		myList.add("dssda");
		myList.add("ada");
		myList.add("adadadad");
		System.out.println("ArrayList before iterator:"+myList);
		Iterator<String> ii=myList.iterator();
		while(ii.hasNext())
		{
			String temp=ii.next();
			//if(temp.equals("ada"))myList.add("New York");
		}
System.out.println("ArrayList after iterator:"+myList);
ArrayList a2=new ArrayList(100);
a2.add("blah");
a2.add("sda");
a2.add("sda");
a2.add("sda");
a2.add("sda");
a2.add("sda");
a2.add("blah");
a2.add("sda");
a2.add("sda");
a2.add("sda");
a2.add("sda");
a2.add("sda");

Collections.copy(a2,myList);
System.out.println("ArrayList2 after copying from 1"+a2);

Collections.fill(myList,"blah");
System.out.println("filling HashSet with blah:"+myList);

	}
}