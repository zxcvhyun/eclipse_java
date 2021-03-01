package first;

public class InnerExam1 {
	//중첩클래스 또는 인스턴스 클래스
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
