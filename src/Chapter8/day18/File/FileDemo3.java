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
		//���E���²�����C�ļ��У�������e�̴���C�ļ��У���Ϊmkdirһ��ֻ�ܴ���һ��Ŀ¼
		//���E���Ѿ�����C�ļ��У������C�ļ����´���D�ļ���
		File file3 = new File("e:\\");
		file3.mkdir();
//		System.out.println(file3.getAbsolutePath());
		File[] file = file3.listFiles();
		for (File file4 : file) {
			System.out.println(file4);
		}
		
	}

}
