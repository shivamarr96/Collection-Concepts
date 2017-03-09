import java.util.*;
import java.util.Map.Entry;
class TreeDemo3
{
	public static void main(String[] args)
	 {
	 	Comparator c1=new MyNumberComp();
	 	Comparator c2=new MySalaryComp();

		TreeMap<Emp,String> tm1=new TreeMap<>(c1);
	tm1.put(new Emp(1005,"987"),"delhi");
	tm1.put(new Emp(1002,"876"),"mumbai");
	tm1.put(new Emp(1003,"776"),"pune");
	tm1.put(new Emp(1001,"665"),"bangalore");
	
	System.out.println("Sorting 1");
	show(tm1);
	TreeMap tm2=new TreeMap<>(c2);
	System.out.println("Sorting 2");
	tm2.put(new Emp(1005,"987"),"delhi");
	tm2.put(new Emp(1002,"876"),"mumbai");
	tm2.put(new Emp(1003,"776"),"pune");
	tm2.put(new Emp(1001,"665"),"bangalore");
	
	
	show(tm2);
	Emp e1=(Emp)tm1.firstKey();
	System.out.println("Lowest salary="+e1.id+"="+e1.salary);
	Entry<Emp,String> ent=(Entry)tm1.firstEntry();
	Emp e2=(Emp)ent.getKey();
	String str=(String)ent.getValue();
	System.out.println("Lowest salary="+e2.id+"="+e2.salary+"="+str);
	
	}
	static void show(SortedMap sm)
	{
		Set s=sm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry entry=(Map.Entry)i.next();
			Emp mm=(Emp)entry.getKey();
	System.out.println(mm.id+"="+mm.salary+"="+(String)entry.getValue());
		}
	}
}
class Emp
{
	int id;
	String salary;
	Emp(int id,String salary)
	{
		this.id=id;
		this.salary=salary;
	}
	
}
class MyNumberComp implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1,Emp e2)
	{
		if(e1.id>e2.id)
			return 1;
		else
			return -1;
	}
}
class MySalaryComp implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1,Emp e2)
	{
		return e1.salary.compareTo(e2.salary);
	}
}