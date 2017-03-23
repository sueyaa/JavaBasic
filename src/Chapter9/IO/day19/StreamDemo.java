package Chapter9.IO.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo {

public static void main(String[] args) {
		
		StreamDemo sd = new StreamDemo();
		File file = new File("E:\\A\\A.txt");
		try {
			//sd.writeToFile(file, "�Ϻ�������ħ����˭֪��Ϊʲô.");
			String temp = sd.readFromFile(file);
			System.out.println(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/**
	 * ʹ���ֽ������ļ���д������
	 * @param file  Ҫд����ļ�
	 * @param content Ҫд�������
	 * @throws IOException  ��ΪFileNotFound��IO������.�׳�������Դ���������͸��౾��.
	 */
	public void writeToFile(File file,String content) throws IOException{
		//--1.�Բ��������
		if (file == null || content == null || content.length() == 0) {
			return ;
		}
		//--2.���ݲ����е�File���󹹽�һ�����������
		/*
		 * file ��Ҫ������Ǹ��ļ���.
		 * true boolean append �Ƿ���׷�ӵ���ʽд������
		 * �����ָ����ֵʹ��ֻ��һ��File��Ϊ�����Ļ�������
		 * ��false.��ô�ڶ��β�������ݻ�ѵ�һ�β���ĸ���
		 */
		OutputStream os = new FileOutputStream(file);
		
		//--3.ͨ����������õ�д�����������ļ���д������
		
		/*
		 *b Ҫд�������.��Ϊ���ֽ������������b���ֽ�����.
		 *off offset ƫ����.������Դд���ļ�ʱ.�ù�����ƫ��.���������￪ʼ���뵽�ļ���
		 *len length.����Ҫд��ĳ���. 
		 */
		os.write(content.getBytes());
		//os.write(b);//--int
		//os.write(b);//--byte[]
		//--4.�����ر�
		os.close();	
	}
	
	/**
	 * ���ļ��ж�ȡ����
	 * @param file
	 * @return
	 * @throws IOException 
	 */
	public String readFromFile(File file) throws IOException{
		
		//--1.�Բ�������֤
		if (file == null) {
			throw new IllegalArgumentException("����������");
		}
		
		//--2.���ݲ���File��������������
		InputStream is = new FileInputStream(file);
		//--3.�ṩ�ֽ���������������ļ��ж�ȡ������
		//--����ĳ���ͨ����256��������.����2048�Ƚ��ټ�
		byte[] buffer = new byte[1024];
		//--4.ͨ���������е�reand�������ж�ȡ.�����ݶ�ȡ��������	
		is.read(buffer);
		//--5.�����ر�
		is.close();
		//--6.���ֽ����鹹����һ��String����.������.
		return new String(buffer);
	}
}
