package first;

public class AccessObj {
	public int p = 3; //어떤 클래스든 접근 가능
	
	protected int p2 = 4; //자기 자신, 같은 패키지, 서로 다른 패키지인경우 자식 클래스에서는 접근할수 있다는 것을 의미
	
	int k = 2; //디폴트 접근 지정자. 자기자신과 같은 패키지만 접근 가능
	
	private int i = 1; //자기 자신만 접근
	

	
	
}
