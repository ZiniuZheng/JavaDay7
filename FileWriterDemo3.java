package io;

import java.io.FileWriter;
import java.io.IOException;
/*
 * void write(String str):写一个字符串数据
 * void write(String str,int index,int len):写一个字符串中的一部分数据
 * void write(int ch):写一个字符数据，这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
 * void write(char[] chs):写一个字符数组数据
 * void write(char[] chs,int index,int len):写一个字符数组的一部分数据
 */
public class FileWriterDemo3 {

	public static void main(String[] args) throws IOException{
		//创建输出流对象
		FileWriter fw = new FileWriter("/Users/zhengziniu/a.txt");
		
		//void write(String str):写一个字符串数据
		fw.write("abcde\n");
		fw.flush();
		
		//void write(String str,int index,int len):写一个字符串中的一部分数据
		fw.write("abcde",0,5);
		fw.flush();
		fw.write("abcde",1,3);
		fw.flush();
		
		//void write(int ch):写一个字符数据，这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
		fw.write('a');
		fw.flush();
		fw.write(97);
		fw.flush();
		
		//void write(char[] chs):写一个字符数组数据
		char[] chs = {'a','b','c','d','e'};
		fw.write(chs);
		fw.flush();
		
		//void write(char[] chs,int index,int len):写一个字符数组的一部分数据
		fw.write(chs,0,5);
		fw.flush();
		fw.write(chs,2,3);
		fw.flush();
		
		//释放资源
		fw.close();

	}

}
