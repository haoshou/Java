package io.main;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  在整个java.io包之中，File类是唯一的一个与文件本身操作有关的类，
 *  所谓的文件本身指的是：文件的创建、删除、重命名、取得文件大小、修改日期。
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		/*baseOperate();
		judgeParentFile();
		getBaseInfo();
		getFileList();*/
		getAllFileList();
	}

	/**
	 * 列出指定目录下的全部内容
	 */
	public static void getAllFileList() {
		File file = new File("D:");
		print(file);
	}

	public static void print(File file){
		if(file.isDirectory()){
			File[] files = file.listFiles();
			if(files!=null){
				for(int i  = 0;i < files.length;i++){
					print(files[i]);
				}
			}
		}
		System.out.println(file);
	}

	/**
	 * 在File类之中有一个非常重要的方法，可以列出一个指定目录下的全部文件信息：
	 · 列出目录内容：public File[] listFiles()，此方法将目录中的所有文件以File对象数组的方式返回；
	 */
	public static void getFileList() {
		File file = new File("D:"); // 文件的路径
		if (file.exists()) { // 文件目录存在
			File result[] = file.listFiles(); // 列出目录中的全部内容
			for (int x = 0; x < result.length; x++) {
				System.out.println(result[x]);
			}
		}

	}

	/**
	 * 在File类之中还可以通过以下的方法取得一些文件的基本信息：
	 · 取得文件的名称|：public String getName()；
	 · 给定的路径是否是文件夹：public boolean isDirectory()；
	 · 给定的路径是否是文件：public boolean isFile()；
	 · 是否是隐藏文件：public boolean isHidden()；
	 · 文件的最后一次修改日期：public long lastModified()；
	 · 取得文件大小：public long length()，是以字节为单位返回的。

	 */
	public static void getBaseInfo() {
		File file = new File("D:" + File.separator + "eclipse.zip"); // 文件的路径
		if (file.exists()) { // 文件存在
			System.out.println("文件名称：" + file.getName());
			System.out.println(file.getName()
					+ (file.isDirectory() ? "是一个目录。" : "不是一个目录。"));
			System.out.println(file.getName()
					+ (file.isFile() ? "是一个文件。" : "不是一个文件。"));
			System.out.println(file.getName()
					+ (file.isHidden() ? "是一个隐藏文件。" : "不是一个隐藏文件。"));
			System.out.println("最后一次更改日期："
					+ new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
					.format(new Date(file.lastModified())));
			System.out.println("文件大小："
					+ new BigDecimal(file.length() / (double) 1024 / 1024)
					.divide(new BigDecimal(1), 2,
							BigDecimal.ROUND_HALF_UP).doubleValue()
					+ "M。");
		}
		}

	/**
	 * 假如现在目录不存在，所以不能创建，那么这个时候必须要首先判断要创建文件的父路径是否存在，如果不存在应该创建一个目录，之后再进行文件的创建，而要想完成这样的操作，需要以下几个方法的支持：
	   找到一个指定文件的父路径：public File getParentFile()；
	   创建目录：public boolean mkdirs()。
	 */
	public static void judgeParentFile() throws IOException {
		File file = new File("D:" + File.separator + "test" + File.separator + "demo.txt");
		if(!file.getParentFile().exists()){//父路径不存在
			file.getParentFile().mkdirs();//创建目录
			file.createNewFile();
		}
	}

	/**
	 * 文件的基本操作，主要有两种功能：
	 创建文件：public boolean createNewFile() throws IOException；
	 删除文件：public boolean delete()；
	 判断路径是否存在：public boolean exists()；
	 */
	public static void baseOperate() throws IOException {
		File file = new File("D:\\demo.txt");
		if(file.exists()){//若文件存在
			file.delete();//删除文件
		}else{
			file.createNewFile();//	创建新文件
		}
	}
}
