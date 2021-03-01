package first;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 5;
		
		try {
		int k = i/j;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. " + e.toString());
		} finally {
			System.out.println("오류가 발생했거나 하지 않아도 실행");
		}
		System.out.println("main end!!");
		
		
	}

}
