package Map;

import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {
	public static void main(String[] args) {
		Map<Integer,String> map = new Hashtable<>();
		map.put(2,"小明");
//		map.put(null,"小白");	//key不能为null,不然会报错
		System.out.println(map.get(2));
		System.out.println(map.get(10));
	}
}
