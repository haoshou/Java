package commonApi;

/**
 * StringBuffer类方便用户进行内容的修改
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		strConvertBuffer();
		bufferConvertStr();
		reverse();
	}

	private static void reverse() {
		//字符串操作反转
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Helloworld");
		System.out.println(stringBuffer.reverse());
	}

	private static void bufferConvertStr() {
		//将StringBuffer变为String，利用StringBuffer类的toString()方法完成
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("HelloWorld");
		String string = stringBuffer.toString();
		System.out.println(string);
	}

	private static void strConvertBuffer() {
		//方法一：直接利用StringBuffer的构造方法
		String str = "HelloWorld";
		StringBuffer stringBuffer = new StringBuffer(str);
		System.out.println(stringBuffer);
		//方法二：利用StringBuffer的append方法
		String string = "test";
		StringBuffer stringBuffer2 = new StringBuffer();
		stringBuffer2.append(string);
		System.out.println(stringBuffer2);
	}
}
