package first;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 5;
		
		try {
		int k = i/j;
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�. " + e.toString());
		} finally {
			System.out.println("������ �߻��߰ų� ���� �ʾƵ� ����");
		}
		System.out.println("main end!!");
		
		
	}

}
