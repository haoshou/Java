package io;
/**
 * 打印流
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream stream = new PrintStream(new FileOutputStream(new File("D:\\test.txt")));
		stream.print("hell");
		stream.close();
	}
}
