package io.main;
/**
 *  Reader是进行字符数据读取的操作类
 *  Reader依然是抽象类，那么如果从文件读取，依然使用FileReader类。
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\test.txt");
		FileReader reader = new FileReader(file);
		char data[] = new char[1024];
		int read = reader.read(data);
		System.out.println(new String(data,0,read));
		reader.close();
	}
}
