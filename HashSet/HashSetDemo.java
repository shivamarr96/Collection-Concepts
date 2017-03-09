import java.util.*;
public class HashSetDemo
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<>();
		System.out.println("Size="+hs.size());
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		System.out.println("Result:"+hs.add("d"));
		System.out.println("Size="+hs.size());
		System.out.println(hs);
		}
	}