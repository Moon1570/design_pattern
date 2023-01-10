package Singleton_01;


public class SingletonPattern_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton single = Singleton.getInstance();
		int sum = single.getSum(10, 15);
		System.out.println("Sum: "+sum);
		
		single.showMessag();
	}

}
