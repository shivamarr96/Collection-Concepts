import java.util.*;
import java.io.*;
public class SysPropertiesDemo
{
	public static void main(String[] args) 
	{
Properties prop=System.getProperties();
SortedMap sorted=new TreeMap(prop);
Set keys=sorted.keySet();
Iterator i=keys.iterator();
while(i.hasNext())
{
	String key=(String)i.next();
	String value=(String)prop.getProperty(key);
	System.out.println(key+" = "+value);
}
}
}