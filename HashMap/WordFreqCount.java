import java.util.*;
public class WordFreqCount
{
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		String str="this is a test this is a test lalu";
		String sarr[]=str.split("\\s");
		for(int i=0;i<sarr.length;i++)
		{
			if(map.containsKey(sarr[i]))
			{
			int temp=map.get(sarr[i]);
			map.put(sarr[i],temp+1);	
			}
			else
			{
				map.put(sarr[i],1);
			}
		}
		System.out.println(map);

	}
}
