package Chapter5.homework;

/*3.鸡兔同笼是我国古代著名的趣题之一。大约在1500年前，《孙子算经》中记载了这样 一道题：今有稚兔同笼，
    上有35个头，下有94足，问鸡兔各几只？试编写程序解决这个 问题*/

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for(;i<35;i++){
			if( 2 * i + 4 * (35-i) == 94){
				System.out.println("鸡有"+ i +"只");
				System.out.println("兔有"+(35-i)+"只");
			}
		}
	}

}
