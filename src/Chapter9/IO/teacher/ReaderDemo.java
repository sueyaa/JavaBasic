package Chapter9.IO.teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * �ַ����е�������
 * ���ļ�(��ͨ���ļ�.���ݿ������Դ)�ж�ȡ���ݵ��ڴ�
 * 
 * 
 * ������ϰ:
 * ׼��һ��txtС˵.��С˵��Ŀ¼��ȡ����.
 * �����һ�� XXXX
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class ReaderDemo {

	public static void main(String[] args) {
		ReaderDemo rd = new ReaderDemo();
		try {
			rd.writeToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 1. �ṩFile 2. ����File���������� 3. �����������еķ���. read write 4. �ر�
	 * 
	 */
	public void readFromFile() {

		try {
			File file = new File("E:\\E\\E.txt");
			Reader reader = new FileReader(file);
			try {
				int length = 0;
				char[] buffer = new char[1024];
				StringBuilder sBuilder = new StringBuilder();
				while (-1 != (length = reader.read(buffer))) {
					sBuilder.append(new String(buffer, 0, length));
				}
				System.out.println(sBuilder.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				reader.close();
				reader = null;
			}
		} catch (Exception e) {
		}
	}
	
	/*
	 * ͬ�ֽ�����д�����һ����������̿��Է�Ϊ���¼�������
	 * 
	 * 1. ����File
	 * 2. ����������
	 * 3. ͨ����������÷���write(String)����д�ļ�
	 * 4. ����flush����ˢ�»�����
	 * 5. �����رղ������ñ�����null
	 * 
	 * 
	 */
	public void writeToFile() throws IOException{
		//--1.����File
		File file = new File("E:\\E\\E.txt");
		//--2.������
		Writer writer = new FileWriter(file);
		//--3.���÷�����
		writer.write("�ӵ���!զ��!���費�к�����~�ٲ��������˻�����û����");
		/*
		 * close������������
		 * 	1.flush
		 *  2.close
		 *  
		 *  ���flush�鿴���ֽ���������ַ������.
		 *  ���ֽ����������flush�������.���ǵ����������
		 *  ������û��Ӱ��.��Ϊ���ֽ�����flush�������ʲôҲ����
		 *  
		 *  �ַ�����д���ݲ���һ����ֱ��д���.�����Ȱ������ύ��
		 *  ������.���������������˵�����²Ż�д���ļ�.
		 *  ����ѡ���ֹ�ˢ��
		 *  ����ַ����Ǳ���Ҫʹ��flush�������.
		 *  �����ַ�����close����Ҳ��ִ��flush����. 
		 * 
		 */
		writer.flush();
		writer.close();
		writer = null;
	}
}
