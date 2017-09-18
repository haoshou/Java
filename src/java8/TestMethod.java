package java8;

/**
 * Java8新特性：方法引用
 * 方法引用在Java8之中一共定义了四种形式：
 * 	1.引用静态方法：类名称::static方法名称;
 * 	2.引用某个对象的方法：实例化对象::普通方法;
 * 	3.引用特定类型的方法:特定类::普通方法;
 * 	4.引用构造方法:类名称::new
 */
interface InMessage<P,R>{
	 R zhuanhuan(P p);
}
public class TestMethod {
	public static void main(String[] args) {
		//即:将String.valueOf()方法变为了InMessage接口里的zhuanghuan()方法
		InMessage<Integer,String> msg = String::valueOf;
		String s = msg.zhuanhuan(1000);
		System.out.println(s.replaceAll("0","9"));
	}
}
