package collection;

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
	}
}
