package Chapter8.day16.homework;

import java.util.ArrayList;
import java.util.Scanner;

//2.ʹ��ArrayList��Ƕ��ArrayList��ģ��ӰԺ��λ��������..ģ��ѡ��λ��һ����.

public class ArrayListTwo {

	static final int ROW_SIZE = 10;
	static final int COL_SIZE = 10;
	ArrayList<ArrayList<Boolean>> list = new ArrayList<ArrayList<Boolean>>();
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public void init(){
		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COL_SIZE; j++) {
				Seat seat = new Seat(true);
			}
		}
	}
	
	public void chooseSeat(){
		
	}

}
