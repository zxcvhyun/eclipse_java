package first;

public class MyClass2 {
	//메소드 오버로딩
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y) {
		return x + y;
	}
	
	//public int plus (int i, int j) {
	//}
	//메소드는 명칭보다 타입이 중요!! 같은 타입이 있으면 에러 발생

}
