import java.util.*;
public class ManyToOne
{
	public static void main(String[] args) {
		Map<Integer,List<String>> map=new HashMap<>();
		add(map,1,"dubai");
		add(map,1,"abu dhabi");
		add(map,1,"sharjah");
		add(map,2,"shanghai");
		add(map,2,"beijing");
		add(map,3,"delhi");
		Set<Integer> s=map.keySet();
		for(int i:s)
		{
			List<String> strlist=map.get(i);
			System.out.println(i);
			for(String str:strlist)
			{
			System.out.println(" "+str);
				
			}
		}
		}
		public static void add(Map<Integer,List<String>> map,int key,String value)
		{
			if(map.containsKey(key))
			{
				map.get(key).add(value);
			}
			else
			{
			List<String> list=new ArrayList<>();
			list.add(value);
			map.put(key,list);	
			}
		}
}
