package Chapter7.homework;

import java.util.Random;
import java.util.Scanner;

public class Rule {
	String name;
	int n;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public static String findName(int n){
		String name = "";
		switch(n){
			case 1:
				name = "����";
				break;
			case 2:
				name = "ʯͷ";
				break;
			case 3:
				name = "��";
				break;
			default:
				break;
		}
		return name;
	}
	
	public static int match(int a,int b){
		if(a == b){
			return 0;
		} else if((a==1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)){
			return -1;
		} else if((a==1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)){
			return 1;
		} else{
			System.out.println("��������");
			return -2;
		}
	}
	
	public static void head(People p,Mechine m){
		System.out.println("                           ************************");
		System.out.println("                           ***      ��ȭ����ʼ                 ***");
		System.out.println("                           ************************");
		System.out.println("��ȭ����1������		2.ʯͷ	3.��");
		
		Scanner input = new Scanner(System.in);
		System.out.print("��ѡ��Է���ɫ��1������	2.��Ȩ	3.�ܲ٣���");
		int num = input.nextInt();
		m.setNumber(num);
		m.setCount(0);
		String mName = m.findName(num);
		m.setName(mName);

		System.out.print("���������������");
		String name = input.next();
		p.setName(name);
		p.setCount(0);
		
		System.out.println(name + "\tVS\t" + m.getName() + "\t" + "��ս");
	}
	
	public static void process(People p,Mechine m){
		head(p,m);
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("Ҫ��ʼ�𣿣�y/n��:");
		System.out.println();
		String choice = input.next();
		int i = 0;		
		while(choice.equals("y")){
			i++;
			Rule rule = new Rule();
			System.out.print("���ȭ��1������	2.ʯͷ	3.��	(������Ӧ����)��");
			int n = input.nextInt();
			rule.setN(n);
			String name1 = rule.findName(n);
			rule.setName(name1);
			System.out.println("���ȭ��" + rule.getName());
			
			Random ran = new Random();
			int k = ran.nextInt(3) + 1;
			rule.setN(k);
			String name2 = rule.findName(k);
			rule.setName(name2);
			System.out.println(m.getName() + "��ȭ��"+ rule.getName() );
			
			if(rule.match(n, k) == 1){
				p.setCount(p.getCount() + 1);
				System.out.println("���˵����Ӯ�ˣ������");
			} else if(rule.match(n, k) == -1){
				m.setCount(m.getCount() + 1);
				System.out.println("���˵��^_^,�����ˣ��汿��");
			} else{
				System.out.println("���˵��ƽ��");
			}
			System.out.println();
			System.out.print("�Ƿ�ʼ��һ��(y/n):");
			choice = input.next();
			if(choice.equals("y")){
				continue;
			}else if(choice.equals("n")){
				result(p,m,i);
			} else{
				System.out.println("��������");
			}
		}
	}
		
	public static void result(People p,Mechine m,int i){
		System.out.println("----------------------------------------------------");
		System.out.println(m.getName() + "\t" + "VS"+ "\t" + p.getName());
		System.out.println("��ս������" + i);
		System.out.println();
		System.out.println("����" + "\t" + "�÷�");
		System.out.println(p.getName()+"\t"+p.getCount());
		System.out.println(m.getName()+"\t"+m.getCount());
		System.out.println();
		if(p.getCount() > m.getCount()){
			System.out.println("��Ӯ�ˣ���������Ŷ~~~");
		}else if(p.getCount() == m.getCount()){
			System.out.println("ƽ�֣�������");
		}else{
			System.out.println("�Ǻǣ��������´μ��Ͱ�");
		}
		System.out.println("----------------------------------------------------");
	}
	
}
