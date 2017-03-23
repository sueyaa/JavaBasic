package Chapter9.IO.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 *2.��C�̴���C�ļ����ļ��´���C.txt�ļ�����д��Hello
 *  ��D�̴���D�ļ������洴��D.txt�ļ���д��World
 *  ��E�̴���E�ļ���.���洴��E.txt����д���C.txt��D.txt�ж�ȡ������.
 *  ���е��ļ��к��ļ���������window��ֱ�Ӵ������еĶ��Ǵ��봴��  
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
	//�����ļ��У������ļ�
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
