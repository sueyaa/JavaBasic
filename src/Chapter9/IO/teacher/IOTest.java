package Chapter9.IO.teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ����: 
 * 1.�����ļ�CDE 
 * 2.�����ļ�CDE.txt �ڴ����Ĺ����г���·����һ��.������߼���һ�µ�..���Ƿ�װ����
 * 3.д���ļ�CDE.txt
 * 	д����߼��ǲ����.�ı����д���Ŀ���д������ 
 * 4.��ȡ�ļ�CD ��ȡ���߼�Ҳ�ǲ����.�ı���Ƕ�ȡ��Ŀ��.���ݶ�����ͨ������ֵ������.
 * @author Administrator
 *
 */

/*
 *2.��C�̴���C�ļ����ļ��´���C.txt�ļ�����д��Hello
 *  ��D�̴���D�ļ������洴��D.txt�ļ���д��World
 *  ��E�̴���E�ļ���.���洴��E.txt����д���C.txt��D.txt�ж�ȡ������.
 *  ���е��ļ��к��ļ���������window��ֱ�Ӵ������еĶ��Ǵ��봴��  
 *  
 */

public class IOTest {
	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		IOTest io = new IOTest();
		try {
			File c = io.createFileOrDi("C:\\C\\C.txt");
			File d = io.createFileOrDi("D:\\D\\D.txt");
			File e = io.createFileOrDi("E:\\E\\E.txt");

			io.writeToFile(c, "Hello");
			io.writeToFile(d, "world");
			
			io.writeToFile(e, (io.readFromFile(c) + io.readFromFile(d)).toUpperCase());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * �����ļ����ļ���
	 * 
	 * @throws IOException
	 */
	public File createFileOrDi(String path) throws IOException {
		// -- .1 ������
		if (path == null || path.length() == 0) {
			throw new IllegalArgumentException("�ļ�·��������~");
		}
		// -- .2����·������File����
		File file = new File(path);
		// -- .��File������֤�жϸ�File��ָ����ļ��Ƿ����.
		if (!file.exists()) {
			/*
			 * ����:��֪����·�����Ƿ��в����ڵ��ļ���. ����C:\A\B\A.txt �������A����ļ����Ƿ����.
			 * 
			 */
			// -- .3��ȡ·��������Ŀ¼һ������.��������File
			String parentPath = path.substring(0, path.lastIndexOf(File.separator));
			// -- .4�����µ�·��������File����
			File parentFile = new File(parentPath);
			// -- .5��֤·��û������
			parentFile.mkdirs();
			// -- .6�����ļ��Ĵ���
			file.createNewFile();
		}
		return file;
	}

	/**
	 * ���ļ���д������: 1. ��֤����(��֤�ļ��Ƿ����,���ǲ���һ���ļ�) 2. ����File���󹹽����������(FileOutputStream)
	 * 3. ͨ�������write(byte[])�������ļ���д������ 4. �ر���
	 * 
	 * @throws IOException
	 *             ������������쳣һ���ڹ���������ʱ, �Ҳ����ļ���������FileNotFoundException.�����ڽ���д�ļ�ʱ
	 *             ��������IOException.��ΪIOException��FileNotFoundException�ĸ���
	 *             ����ֱ���׳�����.
	 * 
	 */
	public void writeToFile(File file, String content) throws IOException {

		// -- .1 ������
		if (file == null || !file.isFile() || content == null || content.length() == 0) {
			return;
		}

		// -- .2 ����File����������
		OutputStream os = new FileOutputStream(file);

		// -- .3 �����������е�write(byte[])����д�ļ�
		os.write(content.getBytes());// --getBytes();String
										// �е�api����.��Stringת����byte[].��Ҫע��String�ı����ʽ.

		// -- .4 �����ر�.���ҽ����ñ�����null
		os.close();
		os = null;
	}
	
	/**
	 * ���ļ��ж�ȡ����.������ȡ�����ݴ���String���󲢷���.
	 * 
	 * 1. ��֤����
	 * 2. ����File��������������
	 * 3. ʹ��ѭ���ظ����ļ��ж�ȡ����.�������ݱ��浽StringBuilder��
	 * 4. �����ر�,�������ñ�����null
	 * 5. ��������String���󷵻�.
	 * 
	 * 
	 * @param file Ҫ��ȡ���ļ�
	 * @return content ���ļ��ж�ȡ��.
	 * @throws IOException 
	 */
	public String readFromFile(File file) throws IOException{
		
		//-- .1 
		if (file == null || !file.isFile()) {
			throw new IllegalArgumentException("�ļ�������.");//--���Է����Զ���.
		}
		
		//-- .2 
		InputStream is = new FileInputStream(file);
		
		//-- .3
		int length = 0;
		byte[] buffer = new byte[BUFFER_SIZE];
		//--���ͻ�����Builder������Buffer
		StringBuilder sBuilder = new StringBuilder();
		
		//-- ��������.
		while(-1 != (length = is.read(buffer))){
			sBuilder.append(new String(buffer,0,length)); 
		}
		
		//-- .4 
		is.close();
		is = null;
		
		return sBuilder.toString();
	}
	
	
	

	
	
	
	
	
	
	

}
