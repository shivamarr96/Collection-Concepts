import java.util.*;
import java.io.*;
public class ExXml
{
	public static void main(String[] args) throws Exception 
	{
Properties p=new Properties();
p.put("today",new Date().toString());
p.put("User","Shivam");
FileOutputStream fout=new FileOutputStream("user.props");
p.storeToXML(fout,"updated");
FileInputStream fin=new FileInputStream("user.props");
p.loadFromXML(fin);
p.list(System.out);
System.out.println("hello xml example");
System.out.println(p.getProperty("today"));
System.out.println(p.getProperty("User"));
System.out.println("via get method");
Set s=p.keySet();
Iterator i=s.iterator();
while(i.hasNext())
{
	String key=(String)i.next();
	String value=(String)p.get(key);
	System.out.println(key+"==>"+value);

}
}
}