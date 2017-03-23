package Chapter8.day18.File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("");
		System.out.println(file1.getAbsolutePath());
		File file2 = new File("src\\a.txt");
		System.out.println(file2.getAbsolutePath());
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file3 = new File("\\");
		System.out.println(file3.getAbsolutePath());
		System.out.println(file2.length());
	}

}
