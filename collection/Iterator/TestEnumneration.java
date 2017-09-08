package collection.Iterator;
/**
 * Enumeration是一个最早的输出接口，最早称为枚举输出，在JDK 1.0的时候就已经推出了，
 * 并且在JDK 1.5的时候将其功能进行了扩充，主要就是增加了泛型，在Enumeration接口里面只定义了两个方法：
 	· 判断是否有下一个元素：public boolean hasMoreElements()；
 	· 取得当前元素：public E nextElement()；
 	不过要想取得Enumeration的实例化对象，不能依靠Collection接口了，
 	只能够依靠Vector类完成，在Vector子类之中定义了如下一个方法：public Enumeration<E> elements()。
 */

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumneration {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Hello");
		vector.add("Hello");
		vector.add("World");
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()){
			String s = enumeration.nextElement();
			System.out.println(s);
		}
	}
}
