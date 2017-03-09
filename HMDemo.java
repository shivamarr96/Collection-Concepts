import java.util.*;
class HMDemo
{
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("111","abc");
		hm.put("222","xyz");

		hm.put("333","kjl");
		hm.put("111","hello");
		System.out.println(hm.size());
		Set s=hm.entrySet();
		Iterator <Map.Entry> i=s.iterator();
		while(i.hasNext())
{
	Map.Entry e=i.next();
	System.out.println(e.getKey()+" "+e.getValue());
		
	}
}
}