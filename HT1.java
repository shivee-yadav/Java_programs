import java.util.*;
public class HT1 {
	public static void main(String args[]) {
		Hashtable<String,Integer> obj=new Hashtable<String,Integer>();
		
		obj.put("a",1);
		obj.put("b",2);
		obj.put("c",3);
		
		System.out.println("Size:"+obj.size());
		
		System.out.println("contain 1 as value:"+obj.contains(1));
		System.out.println("contain a as key :"+obj.containsKey("a"));
		
		Integer val=obj.get("a");
		System.out.println(val);
		System.out.println("All keys");
		
		Enumeration<String> k=obj.keys();
		while(k.hasMoreElements()) {
			String key=k.nextElement();
			Integer value=obj.get(key);
			System.out.println("key :"+key+" value :"+value);
		}
		obj.clear();//clear all elements
	}

}
