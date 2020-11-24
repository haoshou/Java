package map;
/**
 * HashTable线程安全，采取同步处理方式，性能相对较低，是JDK1.0推出的
 * 不允许出现null,否则会出现空指针异常
 */

import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();
        map.put(2, "小明");
//		map.put(null,"小白");	//不允许出现null,否则会出现空指针异常
        System.out.println(map.get(2));
        System.out.println(map.get(10));
    }
}
