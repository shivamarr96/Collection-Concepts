import java.util.*;
public class HashMapConverter
{
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		fillData(map);
		String str[]=keysAsArray(map);
		for(String str1:str)
			System.out.println(str1);
		List<String> list=new ArrayList<>();
		list=keysAsList(map);
				for(String str1:list)
			System.out.println(str1);

	}
	public static void fillData(Map<String,String> map)
	{
		map.put("android","mobile");
		map.put("nokia os","comp");
		map.put("apple","ios");
		
	}
	public static String[] keysAsArray(Map<String,String> map)
	{
	Set<String> s=map.keySet();
	String str[]=new String[s.size()];
	s.toArray(str);
	return str;	
	}
	public static List<String> keysAsList(Map<String,String> map)
	{
		List<String> s=new ArrayList<>(map.keySet());
		return s;
	}

}