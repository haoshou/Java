package collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		//如果现在希望Set集合之中保存的数据有顺序，那么就通过TreeSet进行Set接口的实例化。
		Set<String> set = new TreeSet<>();
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println(set);
		//现在发现所有保存的数据没有重复且有序排列。
	}
}
