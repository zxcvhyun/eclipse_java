
public class forEachExam {

	public static void main(String[] args) {
		int[] iarr = {10,20,30,40,50};
		
		for(int i = 0; i < iarr.length; i++) {
			int value  =  iarr[i];
			System.out.println(value);
		}
		
		for(int value:iarr){ //Ÿ�� ���� �޾��� ������:����ϰ� ���� �ڷᱸ��
			System.out.println(value);
		}
	}

}
