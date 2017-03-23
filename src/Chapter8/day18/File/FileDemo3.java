package Chapter8.day18.File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("e:\\A\\B\\C\\");
		file1.mkdirs();
		File file2 = new File("e:\\A\\B\\C","a.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果E盘下不存在C文件夹，则不能在e盘创建C文件夹，因为mkdir一次只能创建一个目录
		//如果E盘已经存在C文件夹，则会在C文件夹下创建D文件夹
		File file3 = new File("e:\\");
		file3.mkdir();
//		System.out.println(file3.getAbsolutePath());
		File[] file = file3.listFiles();
		for (File file4 : file) {
			System.out.println(file4);
		}
		
	}

}
