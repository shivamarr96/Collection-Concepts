import java.util.*;
public class HashSetCopyNRetain
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<>();
		System.out.println("HS Size="+hs.size());
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		HashSet<String> subset=new HashSet<>();
		subset.add("1");
		subset.add("2");
		subset.add("3");
		subset.add("4");
		System.out.println("Subset before\n"+subset);
		System.out.println("HashSet before\n"+hs);
		hs.addAll(subset);
		System.out.println("HashSet after addAll\n"+hs);
		subset.add("5");
		System.out.println("Subset before\n"+subset);
		hs.retainAll(subset);
		System.out.println("HashSet after retainAll\n"+hs);
		
}
}
		