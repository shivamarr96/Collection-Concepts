import java.util.*;
import java.io.*;
public class PropertiesDemo
{
	public static void main(String[] args) 
	{
 loadProperties();
}
public static void loadProperties()
{
FileInputStream fi;
Properties props=new Properties();
try
{
	fi=new FileInputStream("abc.properties");
	props.load(fi);
	System.out.println(props);
	Enumeration names=props.propertyNames();
	while(names.hasMoreElements())
	{
		String key=(String)names.nextElement();
		String value=(String)props.getProperty(key);
		System.out.println(key+" "+value);
	}
}
catch(Exception ee){}
}
}