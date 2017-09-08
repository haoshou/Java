package collection.List;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		//测试ArrayList是否可以保存重复内容
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("World");
		for(int i = 0; i < list.size();i++){
			String s = list.get(i);
			System.out.println(s);
		}
		/**
		 * 在使用代码的时候可以发现，List集合之中即使存在了重复数据，
		 * 也可以正常的保存，而且数据保存的顺序就是存入数据的顺序。
		 */
	}
}
