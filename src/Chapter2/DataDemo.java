package Chapter2;

public class DataDemo{
	/*���ȥ��public������ʾ���´���
	����: ���� DataDemo ���Ҳ��� main ����, �뽫 main ��������Ϊ:
    public static void main(String[] args)
          ���� JavaFX Ӧ�ó����������չjavafx.application.Application*/
	public static void main(String[] args){
		//������������
		byte b = -128;
		short s = 128;
		int i = 128;
		long l = 128L;//�����͵�ֵ������Ҫ��l��L��
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		//��������������
		float f = 0.0f;//�����ȸ����͵�ֵ������Ҫ��f
		double d = 0.0d;//˫���ȸ����͵�ֵ������Ҫ��d
		System.out.println(f);
		System.out.println(d);
		
		//char������ʾһ���ַ��ҽ���һ���ַ�������ռ�����ֽڣ���char���������ֽ�
		//char��������ֵ��Ҫע�⣬A��65����a��97����0��48��
		//��java��char��ӡ����ascii��
		char c = 1;
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		//�������͵�����ֻ������ֵ��ҪôtrueҪôfalse
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		 
	}
}