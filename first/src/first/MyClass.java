package first;

public class MyClass {
	//public ����Ÿ�� �޼ҵ��(�Ű�������){�ʿ��� ����� ����}

	//1. �Ű�����(���� ��)�� ���� ������ ����Ÿ�Ե� ���� ���
	public void method1() {
		System.out.println("m1�� ���� ��..");
	}
	
	//2. ������ �޾Ƶ鿩 �����ϰ� �������� �ʴ� ���
	public void method2(int x) {
		System.out.println(x + "�� �̿��� m2�� ���� ��..");
	}
	
	//3. ���� ������ �ʾ����� ���� �����ؼ� ���� (return)�����ִ� �޼ҵ�
	public int method3() {
		System.out.println("m3�� ���� ��..");
		return 10;
	}	
	
	//4. �������� �ΰ� �޾Ƶ��̰� �������� �ʴ� ��� (�⺻������, ������ �����ͱ��� ���� ����)
	public void method4(int x, int y) {
		System.out.println(x + y + "m4�� ���� ��..");
	}
	
	//5. ���� �޾Ƽ� ���� ����ϴ� �޼ҵ�
	public int method5(int y) {
		System.out.println(y + "�� �̿��� m5�� ���� ��..");
		return y*2;
	}
}
