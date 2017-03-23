package Chapter9.IO.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo {

public static void main(String[] args) {
		
		StreamDemo sd = new StreamDemo();
		File file = new File("E:\\A\\A.txt");
		try {
			//sd.writeToFile(file, "上海被叫做魔都有谁知道为什么.");
			String temp = sd.readFromFile(file);
			System.out.println(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/**
	 * 使用字节流向文件中写入内容
	 * @param file  要写入的文件
	 * @param content 要写入的内容
	 * @throws IOException  因为FileNotFound是IO的子类.抛出父类可以代表其子类和父类本身.
	 */
	public void writeToFile(File file,String content) throws IOException{
		//--1.对参数做检查
		if (file == null || content == null || content.length() == 0) {
			return ;
		}
		//--2.根据参数中的File对象构建一个输出流对象
		/*
		 * file 流要输出到那个文件中.
		 * true boolean append 是否已追加的形式写入数据
		 * 如果不指定该值使用只有一个File作为参数的或者这里
		 * 给false.那么第二次插入的内容会把第一次插入的覆盖
		 */
		OutputStream os = new FileOutputStream(file);
		
		//--3.通过流对象调用的写方法进行向文件中写入内容
		
		/*
		 *b 要写入的内容.因为是字节流所以这里的b是字节数组.
		 *off offset 偏移量.将数据源写入文件时.让光标进行偏移.决定从哪里开始插入到文件中
		 *len length.长度要写入的长度. 
		 */
		os.write(content.getBytes());
		//os.write(b);//--int
		//os.write(b);//--byte[]
		//--4.将流关闭
		os.close();	
	}
	
	/**
	 * 从文件中读取内容
	 * @param file
	 * @return
	 * @throws IOException 
	 */
	public String readFromFile(File file) throws IOException{
		
		//--1.对参数做验证
		if (file == null) {
			throw new IllegalArgumentException("参数有问题");
		}
		
		//--2.根据参数File构建输入流对象
		InputStream is = new FileInputStream(file);
		//--3.提供字节数组用来保存从文件中读取的内容
		//--数组的长度通常是256的整数倍.超过2048比较少见
		byte[] buffer = new byte[1024];
		//--4.通过流对象中的reand方法进行读取.将内容读取到数组中	
		is.read(buffer);
		//--5.将流关闭
		is.close();
		//--6.把字节数组构建成一个String对象.并返回.
		return new String(buffer);
	}
}
