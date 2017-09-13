package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 内存操作流
 * · 字节内存操作流：内存输入流（ByteArrayInputStream）、内存输出流（ByteArrayOutputStream）；
   · 字符内存操作流：内存输入流（CharArrayReader）、内存输出流（CharArrayWriter）。

 */
public class TestMemoryStream {
	public static void main(String[] args) throws IOException {
		String str = "HelloWorld";
		ByteArrayInputStream inputStream = new ByteArrayInputStream(str.getBytes());
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		int temp = 0;
		while((temp = inputStream.read())!=-1){
			outputStream.write(Character.toUpperCase(temp));
		}
		String string = outputStream.toString();
		outputStream.close();
		inputStream.close();
		System.out.println(str);
	}
}
