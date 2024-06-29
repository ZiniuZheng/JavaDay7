package io;

import java.io.FileWriter;
import java.io.IOException;
/*
 * 如何实现数据的换行？
 * 		\n可以实现换行，但是Windows系统自带的记事本打开并没有换行，这是为什么呢？因为Windows识别的换行不是\n，而是\r\n
 * 		Windows: \r\n
 * 		Linux: \n
 * 		Mac: \r
 * 如何实现数据的追加写入？
 * 		FileWriter(String fileName, boolean append)
 */
public class FileWriterDemo4 {

	public static void main(String[] args) throws IOException{
		//创建输出流对象
		//FileWriter fw = new FileWriter("c.txt");
		FileWriter fw = new FileWriter("/Users/zhengziniu/zzn.txt",true); //表示追加写入，默认是false
		fw.write("\r");
		
		for(int i=0;i<10;i++) {
			fw.write("hello world"+i);
			fw.write("\r");
		}
		
		//释放资源
		fw.close();
	}

}
