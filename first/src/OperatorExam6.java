import java.util.Scanner;

public class OperatorExam6 {

	public static void main(String[] args) {
//		int i = 0;
//				
//		while(i < 10) {
//			System.out.println(i);
//			i++; //i = i+1;
//		}

//		int total = 0;
//		int i = 1;
//		while(i <= 100) {
//			total = total + i;
//			i++;
//		}
//		System.out.println(total);
		int i = 1;
		while(i < 11) {
			i++;
			if (i % 2 == 0 ) {
				System.out.println(i);
			}
		}
//---		
		int value = 0;
		/* Sca�� ġ�� �Ŀ� Ctrl + space bar�� �����ø� �ڵ����� �ϼ����ִ� �ܾ��� ����� �ߴµ��� 
		  �� �߿��� Scanner - java.util �̶�� �Ǿ��ִ� �κ����� �ܾ �ϼ��Ͻø� �ڵ����� import java.util.Scanner; �� �߰��˴ϴ�*/
		Scanner scan = new Scanner(System.in); //Ű����κ��� �Է� �� ���� �޴� �κ�
		        //
		do {
			// �ݺ� �� ����� - ������ �ѹ��� ����
			value = scan.nextInt(); //�������� �Է¹޾� value�� ����
			System.out.println("�Է¹��� ��: " + value);
			
		}while(value != 10);//������ ���ؼ� �����ϸ� do�� �ö󰡼� ����
		System.out.println("�ݺ��� ����");
	}

}
