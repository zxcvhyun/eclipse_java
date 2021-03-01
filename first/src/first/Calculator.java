package first;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//default 를 붙이면 메소드 이용 가능
	default int exec(int i, int j) {
		return i + j;
	}
	
	//static 은 반드시 인터페이스명.메소드 형식으로 출력해야한다.
	public static int exec2(int i, int j) {
		return i * j ;
	}
}
