package collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator是最为常用的集合输出接口
 */
public class TestIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello1");
		list.add("Hello2");
		list.add("Hello3");
		Iterator<String> iterable = list.iterator();
		while(iterable.hasNext()){
			String s  = iterable.next();
			System.out.println(s);
		}
	}
}
