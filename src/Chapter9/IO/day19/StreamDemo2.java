package Chapter9.IO.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamDemo2 sd = new StreamDemo2();
		File file1 = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		sd.readFromFile(file1);
	}

	
	public void readFromFile(File file) throws IOException{
		
		if(file == null || !file.exists()){
			throw new IllegalArgumentException("参数有问题");
		}
		InputStream is = new FileInputStream(file);
		File newFile = new File("e:\\Tulips.jpg");
		OutputStream os = new FileOutputStream(newFile);
		byte[] buffer = new byte[1024];
		int length = 0;
		int a = 0;
		while((length = is.read(buffer)) != -1){
			os.write(buffer,0,length);
		}
		is.close();
		os.close();
	}
}
