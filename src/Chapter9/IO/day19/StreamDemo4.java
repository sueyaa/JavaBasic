package Chapter9.IO.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 *2.在C盘创建C文件夹文件下创建C.txt文件里面写入Hello
 *  在D盘创建D文件夹下面创建D.txt文件中写入World
 *  在E盘创建E文件夹.下面创建E.txt里面写入从C.txt和D.txt中读取的内容.
 *  所有的文件夹和文件不允许在window下直接创建所有的都是代码创建  
 *  
 */

public class StreamDemo4 {

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamDemo4 sd4 = new StreamDemo4();
		File c = sd4.createFile("C:\\C\\c.txt");
		File d = sd4.createFile("D:\\D\\d.txt");
		File e = sd4.createFile("E:\\E\\e.txt");
		sd4.writeToFile(c, "hello");
		sd4.writeToFile(d, "world");
		sd4.writeToFile(e, sd4.readFromFile(c) + sd4.readFromFile(d));
	}
	//创建文件夹，创建文件
	public File createFile(String path) throws IOException{
		if(path == null || path.length() == 0){
			throw new IllegalArgumentException();
		}
		
		File file = new File(path);
		if(!file.exists()){
			String parentPath = path.substring(0, path.lastIndexOf(File.separator));
			File parentFile = new File(parentPath);
			parentFile.mkdirs();
			file.createNewFile();
		}
		return file;	
	}
	
	public void writeToFile(File file, String content) throws IOException{
		if(file == null || !file.isFile() || content == null || content.length() == 0){
			return;
		}
		
		OutputStream os = new FileOutputStream(file);
		os.write(content.getBytes());
		os.close();
		os = null;
	}
	
	public String readFromFile(File file) throws IOException{
		if(file == null || !file.isFile()){
			return null;
		}
		InputStream is = new FileInputStream(file);
		int length = 0;
		byte[] buffer = new byte[BUFFER_SIZE];
		StringBuilder sb = new StringBuilder();
		while(-1 != (length = is.read(buffer))){
			sb.append(new String(buffer,0,length));
		}
		return sb.toString();		
	}

}
