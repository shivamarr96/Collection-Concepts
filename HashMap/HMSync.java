import java.util.*;
class HMSync
{
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<>();
		Map hm=Collections.synchronizedMap(hmap);
		hm.put(111,"abc");
		hm.put(222,"xyz");

		hm.put(333,"kjl");
		hm.put(111,"hello");
		System.out.println(hm.size());
		Set s=hm.entrySet();
		synchronized(map)
		{ 
		Iterator <Map.Entry> i=s.iterator();
		while(i.hasNext())
{
	Map.Entry e=i.next();
	System.out.println(e.getKey()+" "+e.getValue());
		
	}
}
}
}