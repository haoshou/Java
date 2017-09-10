package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapEntry {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1,"test1");
		hashMap.put(2,"test2");
		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
	}
}
