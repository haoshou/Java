package base.dataType;

/**
 * String
 * String本身不属于Java的基本数据类型，因为它属于一个类（引用数据类型），
 * 但是这个类使用起来可以像基本数据类型那样方便操作，而且也使用很多，只要是开发都会存在字符串，
 * 字符串是使用“”定义的一串数据。
 */
public class TestString {
	public static void main(String[] args) {
		String str = "Hello";
		str += "World";
		System.out.println(str);

		/**
		 * 所有数据类型只要是碰到了String的连接操作（+），那么都会转向String类型
		 */
	}
}
