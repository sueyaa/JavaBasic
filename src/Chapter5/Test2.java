package Chapter5;
/*
	2.完成购买商品结算功能：
		1、循环输入商品编号和购物数量，计算消费金额并累加到总金额
		2、输入“n”开始结账（假设享8折）
		3、输入实付金额，计算找零
*/

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统    〉   购物结算");
		System.out.println();
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("请输入商品编号：");
		System.out.println();
		System.out.println("1.T恤		2.网球鞋		3.网球拍");
		System.out.println("***************************************************");
		System.out.println();
		boolean flag = true;
		double sum = 0.0;
		
		while(flag){
			System.out.print("请输入商品编号：");
			int number = input.nextInt();
			System.out.print("请输入商品数量：");
			int count = input.nextInt();
			double price = 0.0;
			String comm = "";
			if(number == 1){
				price = 245.0;
				comm = "T恤";
			} else if(number == 2){
				price = 570.0;
				comm = "网球鞋";
			} else if(number == 3){
				price = 300.0;
				comm = "网球拍";
			} else{
				System.out.println("输入有误");
			}
			sum += price * count;
			System.out.println(comm +'\t'+ "￥" + price +'\t'+ "￥" + price * count);
			System.out.println();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                    	System.out.print("是否继续（y/n）");
			String choice = input.next();
			if(choice.equals("y")){
				flag = true;
			}else if(choice.equals("n")){
				flag = false;
				System.out.print("折扣：");
				double discount = input.nextDouble();
				sum *= discount;
				System.out.println("金额总计 " +'\t'+ "￥" + sum);
				System.out.print("实际交费"+'\t'+"￥");
				double money = input.nextDouble();
				System.out.println("找钱"+'\t' +"￥"+ (money-sum));
			}
		}
		
	}

}
