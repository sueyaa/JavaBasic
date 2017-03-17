package Chapter2;
	/*标识符的命名规则
	只能包含数字，字母，下划线和$
	并且不能以数字开头，不推荐以下划线和$开头
	不能使用关键字*/


public class MingMing{
	public static void main(String[] args){
		System.out.println("$a+合法");
		System.out.println("_a+合法");
		System.out.println("aa+合法");
		System.out.println("Aa+合法");
		System.out.println("1a不合法:因为标识符不能以数字开头，只能以字母，$和_开头");
		System.out.println("@a不合法:因为标识符不能以特殊符号开头，只能以字母，$和_开头");
		System.out.println("Ma11$_+合法");
		System.out.println("Ma$_11+合法");
		System.out.println("Ma$_11%^不合法:因为标识符不能包含特殊符号，只能包含数字，字母，$和_");
	}
}