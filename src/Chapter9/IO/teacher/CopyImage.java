package Chapter9.IO.teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//1. 复制一张图片从一个磁盘到另外一个磁盘

public class CopyImage {

	public static void main(String[] args) {

		CopyImage ci = new CopyImage();
		File file = new File("D:\\a.jpg");
		try {
			ci.readFromFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 从文件中读取内容
	 * 
	 * @param file
	 *            要读取的文件
	 * @throws IOException
	 */
	public void readFromFile(File file) throws IOException {
		// --.1参数检查.File所指向的文件不存在怎么办
		if (file == null || !file.exists()) {
			return;
		}
		// --.2利用文件构建流对象
		InputStream is = new FileInputStream(file);
		File newFile = new File("E:\\a.jpg");
		OutputStream os = new FileOutputStream(newFile);
		// --.3读取文件.流对象提供了一个方法read(byte[])
		byte[] buffer = new byte[1024];
		/*
		 * 因为文件本身的大小超过了1024字节.即 一次性是读不完的.需要重复读取.重复操作使用 循环.不确定次数使用while
		 * 
		 * read 返回所读取的字节数.如果读到文件的末尾会返回-1
		 * 
		 */
		int length = 0;//--用于接收read方法的返回值
		while (-1 != (length = is.read(buffer))) {
			os.write(buffer,0,length);
		}
		os.close();
		is.close();
	}
}
