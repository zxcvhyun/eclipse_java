package kr.co.helloWorld.javastudy;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//int result = Fac(5);
		int n = 5 ;
		System.out.println(Fac(n));
	}
	 public static int Fac(int n) {
		//int result = 1;
		//for(int i = n; i > 0; i--) {
		//	result *= i;
		//}
		//return result;
		
		if(n <= 1) {
			return n;
		}else {
			return Fac(n-1)*n;
		}
		 
		 
	 }
}
