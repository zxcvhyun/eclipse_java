package first;

public class InnerExam1 {
	//��øŬ���� �Ǵ� �ν��Ͻ� Ŭ����
	class Cal{
		int value = 0;
		public void puls() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal = t.new Cal();
		cal.puls();
		System.out.println(cal.value);
	}
}
