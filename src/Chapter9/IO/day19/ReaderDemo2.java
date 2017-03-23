package Chapter9.IO.day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReaderDemo2 {

	public static void main(String[] args) throws IOException {
		ReaderDemo2 rd = new ReaderDemo2();
		File file = new File("E:\\红楼梦 （曹雪芹）.txt");
		rd.readFromFile(file);
	}

	public void readFromFile(File file) throws IOException {
		if (file == null || !file.exists()) {
			return;
		}
		InputStream is = new FileInputStream(file);
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		String tmp = null;
		Map<Integer,String> map1 = new HashMap<>();
		Map<Integer,String> map2 = new HashMap<>();
		int a = 0;
		int b = 0;
		StringBuilder str = new StringBuilder();
		while (null != (tmp = br.readLine())) {
			if(!tmp.contains("正文")){
				if(a > 0){
					str.append(tmp);
				}	
			}else{
				map1.put(++a, tmp);
				map2.put(++b, str.toString());
				System.out.println(tmp);
				System.out.println(str);
				str.delete(0, str.length());
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你想查看的章节：");
		int choice = scan.nextInt();
		System.out.println(map2.size());
		for (int i = 1; i <= a; i++) {
			if(i == choice){
				System.out.println(map1.get(i));
				System.out.println(map2.get(i));
				break;
			}
		}
	}
}
