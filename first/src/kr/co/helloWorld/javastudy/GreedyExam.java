package kr.co.helloWorld.javastudy;

import java.util.Arrays;

public class GreedyExam {
	public static void main(String[] args) {
		int n = 7;
		int [] lost = {2,3,4,6};
		int [] reserve = {1,2,3};
		int answer = 0;

    	//System.out.println(lost.length);
        int lost1 = 0;
        int reserve1 = 0;

		//여벌을 가져온 학생이 도난당한 경우 (못빌려줌)
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
 				if(lost[i] == reserve[j]) {
					lost1 ++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
 			
			}
		}   
        //빌려주기
		for(int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {				
             if(lost[i] == reserve[j]+1||lost[i] == reserve[j]-1) {
            	 	reserve1 ++;
            	 	lost[i] = -1;
                    reserve[j] = -1;
                    break;
				}
			}
		}
		//for(int i = 0; i < reserve.length; i++) {
		//	if(reserve[i] == -1) answer ++;
		//}
		
		System.out.println(answer = n-lost.length + lost1 + reserve1);
	}
}
