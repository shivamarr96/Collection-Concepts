import java.util.*;
class TreeDemo1
{
	public static void main(String[] args)
	 {
		TreeMap<String,String> tm=new TreeMap<>();
	tm.put("1005","delhi");
	tm.put("1002","mumbai");
	tm.put("1003","pune");
	tm.put("1001","bangalore");
	show(tm);
	SortedMap<String,String> sm=tm.headMap("1003",true);
	System.out.println("<1003");
	show(sm);
	SortedMap<String,String> sm1=tm.tailMap("1003",true);
	System.out.println(">1003");
	show(sm1);
	SortedMap<String,String> sm2=tm.subMap("1003",true,"1005",true);
	
	System.out.println(">1003,<1005");
	show(sm2);
	
	}
	static void show(SortedMap sm)
	{
		Set s=sm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry entry=(Map.Entry)i.next();

	System.out.println((String)entry.getKey()+"="+(String)entry.getValue());
		}
	}
}