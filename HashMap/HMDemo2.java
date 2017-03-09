import java.util.*;
class HMDemo2
{
	public static void main(String[] args) {
		HashMap<Emp,String> hm=new HashMap<>();
		hm.put(new Emp(111),"abc");
		hm.put(new Emp(22),"xyz");

		hm.put(new Emp(33),"kjl");
		hm.put(new Emp(14),"hello");
		System.out.println(hm.size());
		HashMap clone1=(HashMap)hm.clone();
		System.out.println("clone:\n"+clone1);
		Set s=hm.entrySet();
		Iterator <Map.Entry> i=s.iterator();
		while(i.hasNext())
{
	Map.Entry e=i.next();
	System.out.println((Emp)e.getKey()+" "+e.getValue());
		
	}
	Emp e=new Emp(33);
	String ss=hm.get(e);
	System.out.println(ss);
	hm.remove(e);
	System.out.println(hm);
	hm.clear();
	System.out.println(hm.isEmpty());
}
}
class Emp
{
	int id;
	public Emp(int id)
	{
		this.id=id;

	}
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		if(e.id==this.id)
		{
			return true;
		}
		else
			return false;

	}
	public int hashCode()
	{
		return id*10;
	}
	public String toString()
	{
		return " "+id+" ";
	}
}