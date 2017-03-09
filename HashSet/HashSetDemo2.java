import java.util.*;
public class HashSetDemo2
{
	public static void main(String[] args) 
	{
		HashSet<Emp> hs=new HashSet<>();
		hs.add(new Emp(1001));
		hs.add(new Emp(1002));
		hs.add(new Emp(1003));
		hs.add(new Emp(1004));
		hs.add(new Emp(1005));
		System.out.println("size="+hs.size());
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Emp e=(Emp)i.next();
			System.out.println("ID:"+e.id);
		}
Emp e=new Emp(1003);
System.out.println("Contains 1003:"+hs.contains(e));
hs.remove(e);
System.out.println("updated HashSet,deleting 1003\n"+hs);
}
}
class Emp
{
	int id;
	@Override
	public String toString()
	{
		return ""+id;
	}
	Emp(int id)
	{
		this.id=id;

	}
	@Override
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		if(this.id==e.id)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode()
	{
		return id*10;
	}
}
