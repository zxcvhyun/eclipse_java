package first;

public class InnerExam2 {
	//������øŬ���� �Ǵ� static Ŭ����
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
