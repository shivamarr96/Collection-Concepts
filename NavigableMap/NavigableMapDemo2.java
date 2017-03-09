import java.util.*;
class NavigableMapDemo2
{
	public static void main(String[] args)
	 {
		Calendar now=Calendar.getInstance();
		Locale locale=Locale.getDefault();
		Map<String,Integer> names=now.getDisplayNames(Calendar.DAY_OF_WEEK,Calendar.LONG,locale);
		NavigableMap<String,Integer> tm=new TreeMap<>(names);
		System.out.println("Sorted MAP:\n"+tm);
		System.out.println("NavigableMap using navigableKeySet():\n"+tm.navigableKeySet());
	System.out.println("First Entry:"+tm.firstEntry());
		System.out.println("last Entry:"+tm.lastEntry());
			System.out.println("First Key:"+tm.firstKey());
		System.out.println("last Key:"+tm.lastKey());
		System.out.println("Lower Entry from Tuesday:"+tm.lowerEntry("Tuesday"));
		}
	}
	
		