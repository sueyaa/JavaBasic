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
		//删除此抽象路径名表示的文件或目录。如果此路径名表示一个目录，则此目录必须为空才能删除。 
		//如果此路径不存在，则返回false
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
		//rename重新命名此抽象路径名表示的文件
		System.out.println(file.renameTo(new File("e://D//DDD.txt")));
		
		System.out.println(file1.toString());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.setReadOnly());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z",Locale.CHINA);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss z");

		//--formart方法将当前时间按照上面的格式进行格式化
		//-- 注意这个Date是java.util包下
		String time = format1.format(new Date());
		System.out.println(time);
		System.out.println(file1.lastModified());
		
		
	}

}
