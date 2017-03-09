import java.util.*;
import java.util.concurrent.*;
public class ConcurrentHashMapDemo
{
	public static void main(String[] args) 
	{
	ConcurrentHashMap<Emp,String> lm=new ConcurrentHashMap<>();	
	System.out.println(lm.size());
	
	lm.put(new Emp(1001),"hello");
	lm.put(new Emp(1002),"hey");
	lm.put(new Emp(1003),"hola");
	lm.put(new Emp(1008),"cya");
	lm.put(new Emp(1001),"klalka");
	System.out.println("ConcurrentHashMap before:"+lm);
	
	Set s=lm.keySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
	Emp e=(Emp)i.next();
	if(e.id==1003)lm.put(new Emp(9000),"London");

	}
	System.out.println("ConcurrentHashMap after:"+lm);

	
	HashMap<Emp,String> hm=new HashMap<>();	
	System.out.println(hm.size());
	hm.put(new Emp(1001),"hello");
	hm.put(new Emp(1002),"hey");
	hm.put(new Emp(1003),"hola");
	hm.put(new Emp(1008),"cya");
	hm.put(new Emp(1001),"klalka");
	System.out.println("HashMap before:"+hm);
	try{
	Set s1=hm.keySet();
	Iterator i1=s1.iterator();
	while(i1.hasNext())
	{
	Emp e=(Emp)i1.next();
	if(e.id==1003)hm.put(new Emp(9000),"London");

	}
	System.out.println("HashMap after:"+hm);
	}catch(Exception e){System.out.println("Concurrent Modification");}
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