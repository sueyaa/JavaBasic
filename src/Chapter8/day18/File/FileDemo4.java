package Chapter8.day18.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("e://A//B//C.txt");
		
/*		if(!file1.exists()){
			String path = file1.getAbsolutePath();
			String parentPath = path.substring(0,path.lastIndexOf(File.separator));
			
			File parent = new File(parentPath);
			if(!parent.exists()){
				parent.mkdirs();
			}
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		File file2 = new File("e://A//B//C.txt");
		//ɾ���˳���·������ʾ���ļ���Ŀ¼�������·������ʾһ��Ŀ¼�����Ŀ¼����Ϊ�ղ���ɾ���� 
		//�����·�������ڣ��򷵻�false
	//	System.out.println(file2.delete());
		System.out.println(file1.equals(file2));	*/
		
/*		File file3 = file1.getParentFile();
		try {
			File file4 = file1.getCanonicalFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(file1.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File("e://D//C.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file1.getName());
		System.out.println(file1.getParent());
		System.out.println(file1.getPath());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
		System.out.println(file1.isAbsolute());
		//rename���������˳���·������ʾ���ļ�
		System.out.println(file.renameTo(new File("e://D//DDD.txt")));
		
		System.out.println(file1.toString());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.setReadOnly());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z",Locale.CHINA);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy��MM��dd HH:mm:ss z");

		//--formart��������ǰʱ�䰴������ĸ�ʽ���и�ʽ��
		//-- ע�����Date��java.util����
		String time = format1.format(new Date());
		System.out.println(time);
		System.out.println(file1.lastModified());
		
		
	}

}
