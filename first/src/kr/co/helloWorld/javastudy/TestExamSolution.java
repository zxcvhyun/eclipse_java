package kr.co.helloWorld.javastudy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExamSolution {
	public static void main(String[] args) {

	    int[] answers = {1,3,2,4,2};
	    int[] s1 = {1,2,3,4,5};
	    int[] s2 = {2,1,2,3,2,4,2,5};
	    int[] s3 = {3,3,1,1,2,2,4,4,5,5};
	    
	    int [] score = new int[3];
  
		for(int i = 0; i < answers.length; i++) {
			if (answers[i] == s1[i%5]) 								
				score[0]++;
				//System.out.println("������1: "+ score[0]);
			if(answers[i] == s2[i%8]) 		
				score[1] ++;
				//System.out.println("������2: "+ score[1]);
			if(answers[i] == s3[i%10]) 
				score[2] ++;
				//System.out.println("������3: "+ score[2]);
			//String str = Arrays.toString(score);
		}
		
		int max = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		//max�� ���ϱ�
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];	
			}	
		}
		for(int i = 0; i < score.length; i++) {
			// �� if ���� ���� for�� �ȿ� ������ �׽�Ʈ ��� ����� �ȵ�
			if(max == score[i]) {
				list.add(i+1); //�ε����� 0���� ��
				
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
		Arrays.sort(answer);  

	}
    
    
}
