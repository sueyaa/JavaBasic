package Chapter6;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr1 = new double[5];
		boolean[] arr2 = new boolean[]{true,true,false,false,true,false};
		for (int i = 0; i < arr1.length; i++) {
			if(i == 0){
				arr1[i] = 2.0;
			}else{
				arr1[i] += arr1[i-1] + 2.0;
			}
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
	}

}
