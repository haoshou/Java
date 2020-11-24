package io.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 如果现在要从指定的数据源之中读取数据，使用InputStream
 */
public class TestInputStream {
    public static void main(String[] args) throws IOException {
        /**
         *  在InputStream类之中，定义了三个读取数据的操作方法：
         · 读取单个字节：public abstract int read() throws IOException；
         |- 说明：每次执行read()方法都会读取一个数据源的指定数据，如果现在发现已经读取到了结尾返回-1；
         · 读取多个字节：public int read(byte[] b) throws IOException；
         |- 说明：如果现在要读取的数据小于byte的数据，这个时候read()方法的返回值int返回的是数据个数，如果现在开辟的字节数组小于读取的长度，如果数据已经读完了，则这个时候的int返回的是-1；
         · 读取指定多个字节：public int read(byte[] b, int off, int len) throws IOException。
         */
        readAll();

    }

    public static void readAll() throws IOException {
        File file = new File("D:\\test.txt");// 定义文件路径
        InputStream inputStream = new FileInputStream(file);
        byte data[] = new byte[1024];// 假设要读的长度是1024
        int len = inputStream.read(data);// 读取数据，返回读取个数
        inputStream.close();//关闭
        System.out.println(new String(data, 0, len));
    }
}
