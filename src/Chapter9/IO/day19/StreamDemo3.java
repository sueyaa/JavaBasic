package Chapter9.IO.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo3 {

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamDemo3 sd = new StreamDemo3();
		File file = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		File newFile = new File("e:\\Tulips.jpg");
		byte[] bb = sd.readFromFile(file).getBytes();
		sd.writeToFile(newFile, bb);
	}

	public void writeToFile(File file,byte[] bb) throws IOException{
		if (file == null) {
			return ;
		}
		OutputStream os = new FileOutputStream(file);
		os.write(bb);
		os.close();	
	}
	
	public String readFromFile(File file) throws IOException{
		if(file == null || !file.exists()){
			throw new IllegalArgumentException("参数有问题");
		}	
		InputStream is = new FileInputStream(file);		
		byte[] buffer = new byte[BUFFER_SIZE];
		int length = 0;
		//单客户端使用Builder，其他使用Buffer
		StringBuilder sb = new StringBuilder();
		while(-1 != (length = is.read(buffer))){
			sb.append(new String(buffer,0,length));
		}	
		is.close();
		is = null;
		return sb.toString();
	}
}
