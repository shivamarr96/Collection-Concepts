import java.util.*;
public class HashMapDemo3
{
	public static void main(String[] args) 
	{
		HashMap<Price,String> map=new HashMap<>();
		map.put(new Price(123,"apple"),"apple");
		map.put(new Price(124,"mango"),"mango");
		map.put(new Price(125,"pear"),"pear");
		map.put(new Price(243,"apple"),"sdjs");
		printMap(map);
		Price temp=new Price(124,"mango");

		System.out.println("contains temp:"+map.containsKey(temp));
		System.out.println("contains pear value:"+map.containsValue("pear"));
		map.remove(temp);
		System.out.println("after deletion");
		printMap(map);
	}
	public static void printMap(HashMap<Price,String> map)
	{
		Set<Price> s=map.keySet();
		for(Price p:s)
		{
			System.out.println(p+"==>"+map.get(p));
		}

			}
}
class Price
{
	int mrp;
	String value;
	Price(int mrp,String value)
	{
		this.mrp=mrp;
		this.value=value;
	}
	public String toString()
	{
		return "name="+value+" mrp="+mrp;
	}
	public boolean equals(Object obj)
	{
		System.out.println("Equals");
		if(obj instanceof Price)
		{
		Price pp=(Price)obj;
		return(pp.value.equals(this.value)&&pp.mrp==this.mrp);
		}
		else
		{
			return false;
		}
	}
	public int hashCode()

{
System.out.println("hashcode");
int hc=0;
hc=mrp*20;
hc+=value.hashCode();
return hc;
}
}