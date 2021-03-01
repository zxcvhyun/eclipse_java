package first;

public class VariableScope {
	int globalScope = 10; //글로벌
	static int staticVal = 7; //static 변수 선언
	
	public void scopeTest(int value) {
		int localScope = 20; //로컬
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		//static 키워드가 있으면 인스턴스화 하지 않아도 사용할 수 있다.
		//그렇기 때문에 static 위에 있는 메소드는 사용 불가
		
		//System.out.println(globalScope);
		//System.out.println(localScope);
		//System.out.println(value);
		System.out.println(staticVal);
		
		VariableScope v1 = new VariableScope();
		System.out.println(v1.globalScope);
		VariableScope v2 = new VariableScope();
		v1.globalScope = 10;
		v2.globalScope = 20;
		
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v1.staticVal = 50; //클래스변수는 static한 변수, 값을 저장할 공간이 하나밖에 없어 값을 공유한다.
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		System.out.println(VariableScope.staticVal);
	}
}
