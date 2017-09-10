package Map;
/**
 * 需求：现在在一个List集合里面保存多个String对象，要求将这个List集合变成Set,而后将Set集合之中的全部数据保存在Map集合的
 * value里面，而Map里面的Key用UUID生成，最后将Map里面的数据进行迭代输出
 */

import java.util.*;

public class TestDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("test1");
		list.add("test1");
		list.add("test2");
		list.add("test3");
		Set<String> hashSet = new HashSet<>();
		hashSet.addAll(list);
		Iterator<String> iterator = hashSet.iterator();
		HashMap<String, String> hashMap = new HashMap<>();
		while(iterator.hasNext()){
			String key = UUID.randomUUID().toString();
			String value = iterator.next();
			hashMap.put(key,value);
 		}

		Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()){
			Map.Entry<String, String> stringEntry = entryIterator.next();
			System.out.println("key:" + stringEntry.getKey()+"，"+"value:"+stringEntry.getValue());
		}
	}
}
