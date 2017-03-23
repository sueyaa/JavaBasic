package Chapter8.day18.File;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	
	public static void main(String[] args) throws IOException {
		File file1 = new File("e://a.txt");
		File file2 = new File("d:" + File.separator +"a.txt");
		System.out.println(file1.exists());
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file1.exists());
		File file5 = new File("e:" + File.separator +"a.txt");
		File file3 = new File("e:","a.mp3");
		File parent = new File("e:");
		File file4 = new File(parent,"cc.txt");
		file2.createNewFile();
		file3.createNewFile();
		file4.createNewFile();
	//	File file5 = new File("e://B//b.doc");
		file5.createNewFile();
	}
}
