package first;

public class VariableScope {
	int globalScope = 10; //�۷ι�
	static int staticVal = 7; //static ���� ����
	
	public void scopeTest(int value) {
		int localScope = 20; //����
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		//static Ű���尡 ������ �ν��Ͻ�ȭ ���� �ʾƵ� ����� �� �ִ�.
		//�׷��� ������ static ���� �ִ� �޼ҵ�� ��� �Ұ�
		
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
		
		v1.staticVal = 50; //Ŭ���������� static�� ����, ���� ������ ������ �ϳ��ۿ� ���� ���� �����Ѵ�.
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		System.out.println(VariableScope.staticVal);
	}
}
