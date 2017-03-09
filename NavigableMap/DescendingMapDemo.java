import java.util.*;
class DescendingMapDemo
{
	public static void main(String[] args)
	 {
		NavigableMap<String,String> tm=new TreeMap<>();
	tm.put("1005","delhi");
	tm.put("1002","mumbai");
	tm.put("1003","pune");
	tm.put("1001","bangalore");
	NavigableMap<String,String> rev=tm.descendingMap();
	System.out.println(tm+"\n"+rev);
}
}	