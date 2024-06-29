package io;

import java.io.FileWriter;
import java.io.IOException;
/*
 * 输出流写数据的步骤：
 * 		A：创建输出流对象
 * 		B：调用输出流对象的写数据方法，并刷新缓冲区
 * 		C：释放资源
 * 
 * 相对路径：相对当前项目而言的，在项目的根目录下（zzn.txt)
 * 绝对路径：以最初目录开始的路径（/Users/zhengziniu/zzn.txt）
 * 
 * close()和flush()方法的区别：
 * 		flush():刷新缓冲区。流对象还可以继续使用。
 * 		close():先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
 */
public class FileWriterDemo2 {

	public static void main(String[] args) throws IOException{
		// 创建输出流对象
		//FileWriter fw = new FileWriter("/Users/zhengziniu/zzn.txt");
		FileWriter fw = new FileWriter("/Users/zhengziniu/zzn.txt");
		
		//调用输出流对象的写数据方法，并刷新缓冲区
		fw.write("abcdefghijklmn");
		fw.flush();
		fw.write("o");
		fw.flush();
		
		//释放资源
		fw.close();
		
		//Strem closed
		//fw.write("javaee");
		//fw.flush();
	}

}
