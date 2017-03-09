import java.util.*;
class TreeDemo2
{
	public static void main(String[] args)
	 {
		TreeMap<Temp,String> tm=new TreeMap<>();
	tm.put(new Temp(1005),"delhi");
	tm.put(new Temp(1002),"mumbai");
	tm.put(new Temp(1003),"pune");
	tm.put(new Temp(1001),"bangalore");
	show(tm);
	Temp t=new Temp(1003);
	Temp t1=new Temp(1005);
	
	SortedMap<Temp,String> sm=tm.headMap(t,true);
	System.out.println("<1003");
	show(sm);
	SortedMap<Temp,String> sm1=tm.tailMap(t,true);
	System.out.println(">1003");
	show(sm1);
	SortedMap<Temp,String> sm2=tm.subMap(t,true,t1,true);
	
	System.out.println(">1003,<1005");
	show(sm2);
	System.out.println(tm.get(t1));
	System.out.println("isEmpty:"+tm.isEmpty());
	System.out.println(tm.size());
	tm.remove(t1);
	show(tm);
	
	
	
	
	}
	static void show(SortedMap sm)
	{
		Set s=sm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry entry=(Map.Entry)i.next();
			Temp mm=(Temp)entry.getKey();
	System.out.println(mm.id+"="+(String)entry.getValue());
		}
	}
}
class Temp implements Comparable<Temp>
{
	int id;
	Temp(int id)
	{
		this.id=id;
	}
	@Override
	public int compareTo(Temp t)
	{
if(t.id>this.id)
	return -1;
else if(t.id<this.id)
	return 1;
else
	return 0;
	}
}