package io;


import java.io.*;

/**
 * 现在对于IO操作就存在了字节流和字符流两种操作流，那么对于这两种操作流之间也是可以进行转换的，而转换的操作类有两个：
 * · 将字节输出流变为字符输出流（OutputStream  Writer）：OutputStreamWriter；
 * · 将字节输入流变为字符输入流（InputStream  Reader）：InputStreamReader。
 */
public class TestExchangeStream {
    public static void main(String[] args) throws IOException {
        outExchangeWriter();
        inputExchangeReader();


    }

    public static void inputExchangeReader() throws IOException {
        //将字节输入流变为字符输入流
        File file = new File("D:\\test.txt");
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(inputStream);
        char data[] = new char[1024];
        int read = reader.read(data);
        inputStream.close();
        reader.close();
        System.out.println(new String(data, 0, read));
    }

    public static void outExchangeWriter() throws IOException {
        //将字节输出流变为字符输出流
        File file = new File("D:\\test.txt");
        FileOutputStream outputStream = new FileOutputStream(file);// 字节输出流
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("HaHa");
        outputStreamWriter.close();
    }
}
