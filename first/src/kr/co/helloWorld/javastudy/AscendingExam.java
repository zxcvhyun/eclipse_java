package kr.co.helloWorld.javastudy;

public class AscendingExam {

	public static void main(String[] args) {
		int[] array = {4,5,2,8,9,1,7,3,6}; 
		int num;
		
		//
		for (int i = 0; i < array.length ; i++) {
			System.out.println("i�ǰ�:" + i);
			for (int j = 0; j < array.length -i -1 ; j++) {
				//���� ū ���� �� �ڷ� ��
 				if(array[j] > array[j+1]) {
					num = array[j];
					array[j] = array[j+1];
					array[j+1] = num;
				}
			}
			
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

}
