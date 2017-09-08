package collection.Set;

import java.util.HashSet;
import java.util.Set;

/**
Hash（哈希）属于一种算法，这种算法的核心意义指的是找空保存算法，所以只要一看见hash第一反应就是说没有顺序的保存。
 */
public class TestHashSet {
	public static void main(String[] args) {
		//测试HashSet能否保存重复的内容
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Hello");
		set.add("World");
		set.add("1");
		System.out.println(set);

		//保存数据再输出之后可以发现，重复的数据没有了，并且其本身的保存也是没有任何顺序的。
	}
}
