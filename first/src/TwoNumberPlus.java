
import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;

public class TwoNumberPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] number = {2,1,3,4,1};
			ArrayList<Integer> arrayList = new ArrayList<>();
			
			for (int i = 0; i < number.length ; i++) {
				System.out.println("i�� ��: "+ i);	
				for(int j = i+1; j < number.length; j ++) {
					int num = number[i] + number[j];
					System.out.println("j�� ��:" + j);	
					System.out.println("�հ�:" + num);	
					// �ߺ��� ������  3527456745
					if(!arrayList.contains(num)) {
						arrayList.add(num);
					System.out.println("arraylist:" + num); //�ߺ�����
					}
				}
			}
			int[] answer = new int [arrayList.size()];
	        for (int i = 0; i < arrayList.size(); i++) {
	            answer[i] = arrayList.get(i);
	        }
	       //sorting �ϱ�
			Arrays.sort(answer);
			System.out.println(answer);
			
	}

}
