package collection.List;
/**
 * Vector类是在JDK 1.0的时候就推出的一个最早的实现动态数组的操作类，
 * 实际上对于今天而言，有许多的类上依然还是在使用着Vector，
 * 不过从实际的开发来讲，现在设计的一些程序都是针对于接口的操作了。
 */

import java.util.List;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		List<String> list = new Vector<>();
		list.add("Hello");
		list.add("Hello");
		list.add("World");
		for(int i = 0;i<list.size();i++){
			String s = list.get(i);
			System.out.println(s);
		}
	}
}
