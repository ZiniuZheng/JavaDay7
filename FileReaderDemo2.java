package io;

import java.io.FileReader;
import java.io.IOException;
/*
 * 输入流读数据的步骤：
 * 		A：创建输入流对象
 * 		B：调用输入流对象的读数据方法
 * 		C：释放资源
 */
public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		//创建输入流对象
		//FileReader fr = new FileReader("fr.txt");
		FileReader fr = new FileReader("/Users/zhengziniu/eclipse-workspace/day7/src/io/FileWriterDemo.java");
		/*
		//调用输入流对象的读数据方法
		//int read(char[] cbuf): 一次读取一个字符数组的数据，返回的是实际读取的字符个数
		char[] chs = new char[5];
		
		//第一次读数据
		int len = fr.read(chs);
		System.out.println("len: "+len);
		//System.out.println(new String(chs));
		System.out.println(new String(chs,0,len));
		
		//第二次读数据
		len = fr.read(chs);
		System.out.println("len: "+len);
		//System.out.println(new String(chs));
		System.out.println(new String(chs,0,len));
		
		//第三次读数据
		len = fr.read(chs);
		System.out.println("len: "+len);
		//System.out.println(new String(chs));
		System.out.println(new String(chs,0,len));
		
		//我们发现读取代码的方式相似度很高，想用循环改进，但是不知道什么时候结束循环
		len = fr.read(chs);
		System.out.println("len: "+len);
		len = fr.read(chs);
		System.out.println("len: "+len);
		//通过测试，我们知道，如果实际读取长度是-1的时候，说明没有数据了
		*/
		//char[] chs = new char[5]
		char[] chs = new char[1024]; //这里可以是1024及其整数倍
		int len;
		//1:fr.read(chs)
		//2:len = fr.read(chs)
		//3:len != -1
		while((len = fr.read(chs)) != -1) {
			//System.out.println(new String(chs,0,len));
			System.out.print(new String(chs,0,len));
		}
		
		//释放资源
		fr.close();
	}

}
