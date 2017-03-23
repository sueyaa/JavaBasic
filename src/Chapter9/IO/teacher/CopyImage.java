package Chapter9.IO.teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//1. ����һ��ͼƬ��һ�����̵�����һ������

public class CopyImage {

	public static void main(String[] args) {

		CopyImage ci = new CopyImage();
		File file = new File("D:\\a.jpg");
		try {
			ci.readFromFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ���ļ��ж�ȡ����
	 * 
	 * @param file
	 *            Ҫ��ȡ���ļ�
	 * @throws IOException
	 */
	public void readFromFile(File file) throws IOException {
		// --.1�������.File��ָ����ļ���������ô��
		if (file == null || !file.exists()) {
			return;
		}
		// --.2�����ļ�����������
		InputStream is = new FileInputStream(file);
		File newFile = new File("E:\\a.jpg");
		OutputStream os = new FileOutputStream(newFile);
		// --.3��ȡ�ļ�.�������ṩ��һ������read(byte[])
		byte[] buffer = new byte[1024];
		/*
		 * ��Ϊ�ļ�����Ĵ�С������1024�ֽ�.�� һ�����Ƕ������.��Ҫ�ظ���ȡ.�ظ�����ʹ�� ѭ��.��ȷ������ʹ��while
		 * 
		 * read ��������ȡ���ֽ���.��������ļ���ĩβ�᷵��-1
		 * 
		 */
		int length = 0;//--���ڽ���read�����ķ���ֵ
		while (-1 != (length = is.read(buffer))) {
			os.write(buffer,0,length);
		}
		os.close();
		is.close();
	}
}
