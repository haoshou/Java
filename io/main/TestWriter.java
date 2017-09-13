package io.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *   Writer类也是一个专门用于数据输出的操作类
 *     在Wirter类之中比OutputStream类最为方便的一点就是其可以直接使用String型数据输出，
 *     并且不再需要将其变为字节数组了。而Writer类本身也是一个抽象类，
 *     那么如果要使用依然要依靠它的子类，尤其是现在操作的是文件，使用FileWriter子类。
 */
public class TestWriter {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\test.txt");
		Writer writer = new FileWriter(file);
		String data = "HelloWorld!";
		writer.write(data);// 直接输出字符串
		writer.close();

		//从输出来讲，Wirter类的输出要比OutputStream类更加的方便。
	}
}
