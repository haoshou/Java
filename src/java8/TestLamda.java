package java8;

/**
 * java8新特性：Lamda表达式
 * 利用Lamda表达式最终解决的问题：避免了匿名内部类定义过多无用的操作
 */
interface Animal{
	void eat();
}
public class TestLamda {
	public static void main(String[] args) {
		//使用匿名内部类的方法
		/*fun(new Animal() {
			@Override
			public void eat() {
				System.out.println("eating");
			}
		});*/

		fun(()-> System.out.println("eating"));
		/**
		 * Lamda语法有三种形式
		 * （参数）-> 单行语句;
		 * （参数）-> {单行语句};
		 * （参数）-> 表达式
		 */
	}
	public static void fun(Animal animal){
		animal.eat();
	}
}
