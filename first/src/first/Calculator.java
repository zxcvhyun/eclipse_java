package first;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//default �� ���̸� �޼ҵ� �̿� ����
	default int exec(int i, int j) {
		return i + j;
	}
	
	//static �� �ݵ�� �������̽���.�޼ҵ� �������� ����ؾ��Ѵ�.
	public static int exec2(int i, int j) {
		return i * j ;
	}
}
