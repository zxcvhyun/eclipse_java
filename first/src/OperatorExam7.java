
public class OperatorExam7 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0) {
//				continue; // continue�� ������ �Ʒ��� �ݺ����� �������� �ʰ� �ٽ� �� �� �ݺ������� �ö�
//			}
			if(i == 50) {
				break;    // break�� ������ ���� �������� �ݺ����� ��������
			}
			total = total + i;
		}
		System.out.println(total);
	}

}
