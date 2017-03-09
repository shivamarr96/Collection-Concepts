import java.util.*;
public class LinkedHashMapDemo
{
	public static void main(String[] args) 
	{
	LinkedHashMap<Emp,String> lm=new LinkedHashMap<>(10,0.75f,true);	
	System.out.println(lm.size());
	lm.put(new Emp(1001),"hello");
	lm.put(new Emp(1002),"hey");
	lm.put(new Emp(1003),"hola");
	lm.put(new Emp(1008),"cya");
	lm.put(new Emp(1001),"klalka");
	Set s=lm.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
	Map.Entry e=(Map.Entry)i.next();
	Emp em=(Emp)e.getKey();
	String ss=(String)e.getValue();
	System.out.println(em.id+" "+ss);
	}
	Emp temp=new Emp(1001);
	System.out.println("Contains Key:"+lm.containsKey(temp));
	System.out.println("Contains Value:"+lm.containsValue("cya"));
	
	System.out.println(lm.get(temp));
	System.out.println(lm.get(new Emp(1002)));
	
	//lm.remove(temp);
	System.out.println(lm);
	
	}
}
class Emp
{
	int id;
	Emp(int id)
	{
		this.id=id;
	}
	@Override
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		if(e.id==this.id)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return "number:"+id;
	}
	public int hashCode()
	{
		return id*10;

	}
}