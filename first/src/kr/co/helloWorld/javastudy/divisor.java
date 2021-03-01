package kr.co.helloWorld.javastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class divisor {
	public static void main(String[] args) {
	//	int[] answer = {};
		int[] arr = {5,9,7,10};
		int div = 5;

		solution(arr, div);
		
	}	
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
                count ++;
			}
		}
        if (count == 0){
            list.add(0,-1);
        }        
        answer = new int[list.size()];

		 for(int i = 0; i < list.size(); i++) {
             Collections.sort(list);
			 answer[i] = list.get(i);
			 System.out.println(answer[i]);
		 }
        return answer;
      
    }
}


