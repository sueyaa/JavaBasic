package Chapter9.IO.teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 字符流中的输入流
 * 从文件(普通的文件.数据库等数据源)中读取内容到内存
 * 
 * 
 * 课堂练习:
 * 准备一份txt小说.将小说的目录读取出来.
 * 比如第一章 XXXX
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class ReaderDemo {

	public static void main(String[] args) {
		ReaderDemo rd = new ReaderDemo();
		try {
			rd.writeToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 1. 提供File 2. 根据File构建流对象 3. 调用流对象中的方法. read write 4. 关闭
	 * 
	 */
	public void readFromFile() {

		try {
			File file = new File("E:\\E\\E.txt");
			Reader reader = new FileReader(file);
			try {
				int length = 0;
				char[] buffer = new char[1024];
				StringBuilder sBuilder = new StringBuilder();
				while (-1 != (length = reader.read(buffer))) {
					sBuilder.append(new String(buffer, 0, length));
				}
				System.out.println(sBuilder.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				reader.close();
				reader = null;
			}
		} catch (Exception e) {
		}
	}
	
	/*
	 * 同字节流的写入基本一致整体的流程可以分为以下几个步骤
	 * 
	 * 1. 创建File
	 * 2. 创建流对象
	 * 3. 通过流对象调用方法write(String)进行写文件
	 * 4. 调用flush方法刷新缓冲区
	 * 5. 将流关闭并将引用变量置null
	 * 
	 * 
	 */
	public void writeToFile() throws IOException{
		//--1.创建File
		File file = new File("E:\\E\\E.txt");
		//--2.构建流
		Writer writer = new FileWriter(file);
		//--3.调用方法了
		writer.write("坑爹了!咋办!凉拌不行红烧了~再不行清蒸了还不行没辙了");
		/*
		 * close做了两件事情
		 * 	1.flush
		 *  2.close
		 *  
		 *  针对flush查看了字节输出流和字符输出流.
		 *  在字节输出流中有flush这个方法.但是调用这个方法
		 *  对整体没有影响.因为在字节流中flush这个方法什么也不做
		 *  
		 *  字符流中写内容不是一次性直接写入的.而是先把内容提交到
		 *  缓冲区.当缓冲区保存满了的情况下才会写入文件.
		 *  可以选择手工刷新
		 *  因此字符流是必须要使用flush这个方法.
		 *  并且字符流中close方法也会执行flush操作. 
		 * 
		 */
		writer.flush();
		writer.close();
		writer = null;
	}
}
