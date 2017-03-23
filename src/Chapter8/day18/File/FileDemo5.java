package Chapter8.day18.File;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDemo5 fileDemo5 = new FileDemo5();
		File file = new File("e:\\A");	
		fileDemo5.listAllFiles(file);
	}
	
	public void listAllFiles(File file){
		if(file == null || file.isFile()){
			return;
		}
		
		File[] files = file.listFiles();
		
		if(files == null){
			
			return;
		}
		
		for (File file2 : files) {
			if(file2.isFile()){
				File file3 = new File("e:\\A\\B\\C\\C.txt");
				if(file3.equals(file2)){
					file2.renameTo(new File("e:\\A\\B\\C\\D.txt"));
				}
				System.out.println(file2.getAbsolutePath());
			}else{
				listAllFiles(file2);
			}
		}
	}

}
