package io.main;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  使用File类执行的所有操作都是针对于文件本身，但是却没有针对于文件的内容，而要进行文件内容操作就需要通过Java之中提供的两组类完成：
      字节操作流（是在JDK 1.0的时候定义的）：OutputStream、InputStream；
      字符操作流（是在JDK 1.1的时候定义的）：Writer、Reader。
    但是不管是字节流还是字符流的操作，本身都表示资源操作，而执行所有的资源操作都会按照如下的几个步骤进行，下面以文件操作为例（对文件进行读、写操作）：
    如果要操作的是文件，那么首先要通过File类对象找到一个要操作的文件路径（路径有可能存在，有可能不存在，如果不存在，则要创建路径）；
    通过字节流或字符流的子类为字节流或字符流的对象实例化（向上转型）；
    执行读 / 写操作；
    最后一定要关闭操作的资源（close()），不管日后如何操作，资源永远要关闭。

 */
public class TestOutputStream {
	public static void main(String[] args) {
		/**
		 *   java.io.OutputStream主要的功能是进行字节数据的输出的
		 */

	}

	//使用OutputStream向文件之中输出数据
	@Test
	public void outputData() throws IOException {
		File file = new File("D:\\test.txt");//创建文件
		FileOutputStream outputStream = new FileOutputStream(file);
		String data = "HelloWorld";//要输出的数据
		outputStream.write(data.getBytes());//输出数据，将数据变为字节数组输出
		outputStream.close();//关闭资源

		//使用OutputStream向文件之中输出数据
	}
}
