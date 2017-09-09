package Map;
/**
 * HashMap是Map接口之中使用最多的一个子类
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("name:","小明");
		map.put(null,"小红");
		map.put("name:","小西");//key重复，value会被新内容覆盖
		map.put("test:","小白");
		/*System.out.println(map.get(null));
		System.out.println(map.get("name:"));*/

		Set<String> keySet = map.keySet();	//取得Map里面的所有Key
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println("key:"+key + "," + "value:"+ map.get(key));
		}
	}
}
