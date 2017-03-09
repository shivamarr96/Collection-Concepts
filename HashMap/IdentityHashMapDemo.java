import java.util.*;
public class IdentityHashMapDemo
{
	public static void main(String[] args) 
	{
IdentityHashMap<String,String> im=new IdentityHashMap<>();
HashMap<String,String> hm=new HashMap<>();
im.put(new String("hello"),"meow");
im.put("hello","blue");
hm.put(new String("hello"),"meow");
hm.put("hello","blue");
System.out.println("IdentityHashMap size:"+im.size());
System.out.println("HashMap size:"+hm.size());
System.out.println("IdentityHashMap \n"+im);

System.out.println("HashMap \n"+hm);
im.put("hello","red");
System.out.println("IdentityHashMap \n"+im);

}
}