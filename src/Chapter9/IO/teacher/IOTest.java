package Chapter9.IO.teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 分析: 
 * 1.创建文件CDE 
 * 2.创建文件CDE.txt 在创建的过程中除了路径不一样.整体的逻辑是一致的..考虑封装方法
 * 3.写入文件CDE.txt
 * 	写入的逻辑是不变的.改变的是写入的目标和写入内容 
 * 4.读取文件CD 读取的逻辑也是不变的.改变的是读取的目标.内容都可以通过返回值来返回.
 * @author Administrator
 *
 */

/*
 *2.在C盘创建C文件夹文件下创建C.txt文件里面写入Hello
 *  在D盘创建D文件夹下面创建D.txt文件中写入World
 *  在E盘创建E文件夹.下面创建E.txt里面写入从C.txt和D.txt中读取的内容.
 *  所有的文件夹和文件不允许在window下直接创建所有的都是代码创建  
 *  
 */

public class IOTest {
	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		IOTest io = new IOTest();
		try {
			File c = io.createFileOrDi("C:\\C\\C.txt");
			File d = io.createFileOrDi("D:\\D\\D.txt");
			File e = io.createFileOrDi("E:\\E\\E.txt");

			io.writeToFile(c, "Hello");
			io.writeToFile(d, "world");
			
			io.writeToFile(e, (io.readFromFile(c) + io.readFromFile(d)).toUpperCase());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 创建文件或文件夹
	 * 
	 * @throws IOException
	 */
	public File createFileOrDi(String path) throws IOException {
		// -- .1 检查参数
		if (path == null || path.length() == 0) {
			throw new IllegalArgumentException("文件路径有问题~");
		}
		// -- .2根据路径构建File对象
		File file = new File(path);
		// -- .对File进行验证判断该File所指向的文件是否存在.
		if (!file.exists()) {
			/*
			 * 问题:不知道该路径中是否有不存在的文件夹. 比如C:\A\B\A.txt 并不清楚A这个文件夹是否存在.
			 * 
			 */
			// -- .3截取路径中属于目录一块内容.并构建新File
			String parentPath = path.substring(0, path.lastIndexOf(File.separator));
			// -- .4根据新的路径来构建File对象
			File parentFile = new File(parentPath);
			// -- .5保证路径没有问题
			parentFile.mkdirs();
			// -- .6创建文件的代码
			file.createNewFile();
		}
		return file;
	}

	/**
	 * 向文件中写入内容: 1. 验证参数(验证文件是否存在,且是不是一个文件) 2. 根据File对象构建输出流对象(FileOutputStream)
	 * 3. 通过对象的write(byte[])方法向文件中写入内容 4. 关闭流
	 * 
	 * @throws IOException
	 *             这里包含两个异常一是在构建流对象时, 找不到文件所产生的FileNotFoundException.二是在进行写文件时
	 *             所产生的IOException.因为IOException是FileNotFoundException的父类
	 *             所以直接抛出父类.
	 * 
	 */
	public void writeToFile(File file, String content) throws IOException {

		// -- .1 检查参数
		if (file == null || !file.isFile() || content == null || content.length() == 0) {
			return;
		}

		// -- .2 根据File构建流对象
		OutputStream os = new FileOutputStream(file);

		// -- .3 利用流对象中的write(byte[])方法写文件
		os.write(content.getBytes());// --getBytes();String
										// 中的api方法.将String转换成byte[].需要注意String的编码格式.

		// -- .4 将流关闭.并且将引用变量置null
		os.close();
		os = null;
	}
	
	/**
	 * 从文件中读取内容.并将读取的内容创建String对象并返回.
	 * 
	 * 1. 验证参数
	 * 2. 根据File构建输入流对象
	 * 3. 使用循环重复从文件中读取内容.并将内容保存到StringBuilder中
	 * 4. 将流关闭,并将引用变量置null
	 * 5. 将构建的String对象返回.
	 * 
	 * 
	 * @param file 要读取的文件
	 * @return content 从文件中读取的.
	 * @throws IOException 
	 */
	public String readFromFile(File file) throws IOException{
		
		//-- .1 
		if (file == null || !file.isFile()) {
			throw new IllegalArgumentException("文件有问题.");//--可以返回自定义.
		}
		
		//-- .2 
		InputStream is = new FileInputStream(file);
		
		//-- .3
		int length = 0;
		byte[] buffer = new byte[BUFFER_SIZE];
		//--单客户端用Builder其它用Buffer
		StringBuilder sBuilder = new StringBuilder();
		
		//-- 从右向左看.
		while(-1 != (length = is.read(buffer))){
			sBuilder.append(new String(buffer,0,length)); 
		}
		
		//-- .4 
		is.close();
		is = null;
		
		return sBuilder.toString();
	}
	
	
	

	
	
	
	
	
	
	

}
