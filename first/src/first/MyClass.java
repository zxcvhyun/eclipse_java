package first;

public class MyClass {
	//public 리턴타입 메소드명(매개변수들){필요한 기능을 구현}

	//1. 매개변수(들어가는 값)도 없고 나오는 리턴타입도 없는 경우
	public void method1() {
		System.out.println("m1이 실행 됨..");
	}
	
	//2. 정수를 받아들여 수행하고 리턴하지 않는 경우
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2가 실행 됨..");
	}
	
	//3. 값은 들어오지 않았지만 뭔가 수행해서 값을 (return)돌려주는 메소드
	public int method3() {
		System.out.println("m3이 실행 됨..");
		return 10;
	}	
	
	//4. 정수값을 두개 받아들이고 리턴하지 않는 경우 (기본데이터, 참조형 데이터까지 참조 가능)
	public void method4(int x, int y) {
		System.out.println(x + y + "m4가 실행 됨..");
	}
	
	//5. 값을 받아서 값을 출력하는 메소드
	public int method5(int y) {
		System.out.println(y + "를 이용한 m5가 실행 됨..");
		return y*2;
	}
}
