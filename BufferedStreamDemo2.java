package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 缓冲流的特殊功能：
 * BufferedWriter
 * 		void newLine():写一个换行符，这个换行符由系统决定
 * BufferedReader
 * 		String readLine():一次读取一行数据，但是不读取换行符
 */
public class BufferedStreamDemo2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/zhengziniu/bw2.txt"));
		for(int i=0;i<10;i++) {
			bw.write("hello"+i);
			//bw.write("\r\n");
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/zhengziniu/eclipse-workspace/day7/src/io/FileWriterDemo.java"));
		/*
		String line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		*/
		
		String line;
		//1.br.readLine()
		//2.line = br.readLine()
		//3.line != null
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}

}
