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
		System.out.println("��ӭ����С�꣬��ѡ����Ҫ���еĲ�����");
		System.out.println("1�������Ʒ	 2�������Ʒ�����ﳵ	3��ɾ����Ʒ	 4���޸���Ʒ����	 5����ʾ���������Ʒ��Ϣ");
		int a = 0;
		try {
			a = scan.nextInt();
		} catch (Exception e) {
			System.out.println("�������Ͳ���ȷ��������һ������");
		}
		
		
		switch(a){
			case 1:
				ct.showAllProduct();
				break;
			case 2:
				Product pro = new Product();
				System.out.println("�����Ʒ�����ﳵ����������Ʒ���");
				String str = scan.next();
				pro = ct.getProduct(str);
				System.out.println("���������Ʒ�����ڣ�����������");					
			
				System.out.println("������Ҫ���������");
				int num = scan.nextInt();
				if(num > pro.getNumber()){
					System.out.println("��������������ܴ��ڿ��" + pro.getNumber());
				}else{
					ibi.addToCart(pro, num);
				}
				break;
			case 3:
				Product pro1 = new Product();
				while(pro1 == null){
					System.out.println("������Ҫɾ������Ʒ���");
					str = scan.next();
					pro1 = ct.getProduct(str);
					System.out.println("���������Ʒ�����ڣ�����������");	
					ibi.delete(pro1);
					break;
				}
			case 4:
				Product pro2 = new Product();
				while(pro2 == null){
					System.out.println("�����Ʒ�����ﳵ����������Ʒ���");
					str = scan.next();
					pro2 = ct.getProduct(str);
					System.out.println("���������Ʒ�����ڣ�����������");					
				}
				System.out.println("������Ҫ���������");
				int num1 = scan.nextInt();
				if(num1 > pro2.getNumber()){
					System.out.println("��������������ܴ��ڿ��" + pro2.getNumber());
				}else{
					ibi.addToCart(pro2, num1);
				}
				break;
			case 5:
				ibi.showAllProductsByTotalPrice();
				break;
			default:
				System.out.println("��ӭ�´ι���");
		}
	}

	public void init(){
		Product pro1 = new Product("�������ɿ���","001",35.0,10);
		Product pro2 = new Product("java���ļ�����","002",78.1,10);
		Product pro3 = new Product("coco cola","003",25.0,10);
		Product pro4 = new Product("��Ƭ","004",3.5,10);
		Product pro5 = new Product("�����","005",5.5,10);
		
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
		System.out.println("��ӭ���������Ʒ����ӭѡ��");
		for (Product product : list) {
			System.out.println(product.toString());
		}
	}
}
