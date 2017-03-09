import java.util.*;
public class WeakHashMapDemo
{
	public static void main(String[] args) 
	{
	WeakHashMap<Temporary,String> wm=new WeakHashMap<>();	
	HashMap<Temporary,String> hm=new HashMap<>();
	Temporary t1=new Temporary();
	Temporary t2=new Temporary();
	System.out.println(wm.size());
	wm.put(t1,"hello");
	System.out.println(wm);
	t1=null;
	System.gc();
	System.out.println(wm);
	hm.put(t2,"hell");
	System.out.println(hm);
	t2=null;
	System.gc();
	System.out.println(hm);
}
}
class Temporary
{
	public String toString()
	{
		return "meow";
	}
	public void finalize()
	{
	System.out.println("Finalise");		
	}
} 