package Chapter7.homework;

import java.util.Scanner;
import java.util.Random;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People();
		Mechine m = new Mechine();
		Rule rule = new Rule();
		rule.process(p, m);
	}

}
