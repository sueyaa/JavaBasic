package Chapter9.IO.day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo1 {
	public static void main(String[] args) throws IOException {
		ReaderDemo1 rd = new ReaderDemo1();
		File file = new File("E:\\ºìÂ¥ÃÎ £¨²ÜÑ©ÇÛ£©.txt");
		rd.readFromFile(file);
	}

	public void readFromFile(File file) throws IOException {
		if (file == null || !file.exists()) {
			return;
		}

		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String tmp = null;
		while (null != (tmp = br.readLine())) {
			if (tmp.contains("ÕýÎÄ")) {
				System.out.println(tmp);
			}
		}
	}
}
