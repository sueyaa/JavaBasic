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
				name = "剪刀";
				break;
			case 2:
				name = "石头";
				break;
			case 3:
				name = "布";
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
			System.out.println("数据有误");
			return -2;
		}
	}
	
	public static void head(People p,Mechine m){
		System.out.println("                           ************************");
		System.out.println("                           ***      猜拳，开始                 ***");
		System.out.println("                           ************************");
		System.out.println("出拳规则：1：剪刀		2.石头	3.布");
		
		Scanner input = new Scanner(System.in);
		System.out.print("请选择对方角色（1：刘备	2.孙权	3.曹操）：");
		int num = input.nextInt();
		m.setNumber(num);
		m.setCount(0);
		String mName = m.findName(num);
		m.setName(mName);

		System.out.print("请输入你的姓名：");
		String name = input.next();
		p.setName(name);
		p.setCount(0);
		
		System.out.println(name + "\tVS\t" + m.getName() + "\t" + "对战");
	}
	
	public static void process(People p,Mechine m){
		head(p,m);
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("要开始吗？（y/n）:");
		System.out.println();
		String choice = input.next();
		int i = 0;		
		while(choice.equals("y")){
			i++;
			Rule rule = new Rule();
			System.out.print("请出拳：1：剪刀	2.石头	3.布	(输入相应数字)：");
			int n = input.nextInt();
			rule.setN(n);
			String name1 = rule.findName(n);
			rule.setName(name1);
			System.out.println("你出拳：" + rule.getName());
			
			Random ran = new Random();
			int k = ran.nextInt(3) + 1;
			rule.setN(k);
			String name2 = rule.findName(k);
			rule.setName(name2);
			System.out.println(m.getName() + "出拳："+ rule.getName() );
			
			if(rule.match(n, k) == 1){
				p.setCount(p.getCount() + 1);
				System.out.println("结果说：你赢了，真棒！");
			} else if(rule.match(n, k) == -1){
				m.setCount(m.getCount() + 1);
				System.out.println("结果说：^_^,你输了，真笨！");
			} else{
				System.out.println("结果说：平手");
			}
			System.out.println();
			System.out.print("是否开始下一轮(y/n):");
			choice = input.next();
			if(choice.equals("y")){
				continue;
			}else if(choice.equals("n")){
				result(p,m,i);
			} else{
				System.out.println("输入有误");
			}
		}
	}
		
	public static void result(People p,Mechine m,int i){
		System.out.println("----------------------------------------------------");
		System.out.println(m.getName() + "\t" + "VS"+ "\t" + p.getName());
		System.out.println("对战次数：" + i);
		System.out.println();
		System.out.println("姓名" + "\t" + "得分");
		System.out.println(p.getName()+"\t"+p.getCount());
		System.out.println(m.getName()+"\t"+m.getCount());
		System.out.println();
		if(p.getCount() > m.getCount()){
			System.out.println("你赢了，继续加油哦~~~");
		}else if(p.getCount() == m.getCount()){
			System.out.println("平手，还不错啊");
		}else{
			System.out.println("呵呵，笨蛋，下次加油啊");
		}
		System.out.println("----------------------------------------------------");
	}
	
}
