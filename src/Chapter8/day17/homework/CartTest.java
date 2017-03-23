package Chapter8.day17.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CartTest{
	
	List<Product> list = new ArrayList<>();
	
	public static void main(String[] args) {
		CartTest ct = new CartTest();
		Map<Product,Integer> map = new HashMap<>();
		ICartBizImpl ibi = new ICartBizImpl();
		Scanner scan = new Scanner(System.in);
		ct.init();
		System.out.println("欢迎光临小店，请选择您要进行的操作：");
		System.out.println("1、浏览商品	 2、添加商品到购物车	3、删除商品	 4、修改商品数量	 5、显示所购买的商品信息");
		int a = 0;
		try {
			a = scan.nextInt();
		} catch (Exception e) {
			System.out.println("数据类型不正确，请输入一个整数");
		}
		
		
		switch(a){
			case 1:
				ct.showAllProduct();
				break;
			case 2:
				Product pro = new Product();
				System.out.println("添加商品到购物车，请输入商品编号");
				String str = scan.next();
				pro = ct.getProduct(str);
				System.out.println("你输入的商品不存在，请重新输入");					
			
				System.out.println("请输入要购买的数量");
				int num = scan.nextInt();
				if(num > pro.getNumber()){
					System.out.println("您输入的数量不能大于库存" + pro.getNumber());
				}else{
					ibi.addToCart(pro, num);
				}
				break;
			case 3:
				Product pro1 = new Product();
				while(pro1 == null){
					System.out.println("请输入要删除的商品编号");
					str = scan.next();
					pro1 = ct.getProduct(str);
					System.out.println("你输入的商品不存在，请重新输入");	
					ibi.delete(pro1);
					break;
				}
			case 4:
				Product pro2 = new Product();
				while(pro2 == null){
					System.out.println("添加商品到购物车，请输入商品编号");
					str = scan.next();
					pro2 = ct.getProduct(str);
					System.out.println("你输入的商品不存在，请重新输入");					
				}
				System.out.println("请输入要购买的数量");
				int num1 = scan.nextInt();
				if(num1 > pro2.getNumber()){
					System.out.println("您输入的数量不能大于库存" + pro2.getNumber());
				}else{
					ibi.addToCart(pro2, num1);
				}
				break;
			case 5:
				ibi.showAllProductsByTotalPrice();
				break;
			default:
				System.out.println("欢迎下次光临");
		}
	}

	public void init(){
		Product pro1 = new Product("费列罗巧克力","001",35.0,10);
		Product pro2 = new Product("java核心技术卷","002",78.1,10);
		Product pro3 = new Product("coco cola","003",25.0,10);
		Product pro4 = new Product("薯片","004",3.5,10);
		Product pro5 = new Product("冰淇淋","005",5.5,10);
		
		list.add(pro1);
		list.add(pro2);
		list.add(pro3);
		list.add(pro4);
		list.add(pro5);
	}

	public Product getProduct(String str){
		Product pro = new Product();
		for (Product product : list) {
			if(product.getId().equals(str)){
				pro = product;
			}
		}
		return pro;
	}
	
	public void showAllProduct(){
		System.out.println("欢迎浏览所有商品，欢迎选购");
		for (Product product : list) {
			System.out.println(product.toString());
		}
	}
}
