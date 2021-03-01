package first;

public class InnerExam2 {
	//정적중첩클래스 또는 static 클래스
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
