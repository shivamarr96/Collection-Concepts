import java.util.*;
class NavigableMapDemo
{
	public static void main(String[] args)
	 {
		NavigableMap<String,String> tm=new TreeMap<>();
	tm.put("1005","delhi");
	tm.put("1002","mumbai");
	tm.put("1009","nyc");
	tm.put("1006","dxb");
	tm.put("1010","lax");
	tm.put("1003","pune");
	tm.put("1001","bangalore");
	System.out.println("Sorted MAP:\n"+tm);
	System.out.println("Ceiling 1004:"+tm.ceilingKey("1004"));
		System.out.println("Floor 1004:"+tm.floorKey("1004"));
		System.out.println("Ceiling 1004:"+tm.ceilingEntry("1004"));
		System.out.println("Floor 1004:"+tm.floorEntry("1004"));
		System.out.println("First Entry:"+tm.firstEntry());
		System.out.println("last Entry:"+tm.lastEntry());
			System.out.println("First Key:"+tm.firstKey());
		System.out.println("last Key:"+tm.lastKey());
		System.out.println("Higher Entry from 1009:"+tm.higherEntry("1009"));
	System.out.println("Lower Entry from 1009:"+tm.lowerEntry("1009"));
	System.out.println("Sorted MAP before:\n"+tm);
	System.out.println("Deleting firstEntry:"+tm.pollFirstEntry());

	System.out.println("Deleting LastEntry:"+tm.pollLastEntry());
System.out.println("Sorted MAP after deletion:\n"+tm);

			
	}
}