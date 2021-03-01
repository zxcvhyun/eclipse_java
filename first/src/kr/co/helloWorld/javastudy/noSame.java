package kr.co.helloWorld.javastudy;

import java.util.ArrayList;
import java.util.Arrays;

public class noSame {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] answer = {};
		
		//연속된 숫자면 하나만 남기고 제거

		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				list.add(arr[i]);
				//System.out.println(list);
			}else if(arr[i] != arr[i-1]) {
				list.add(arr[i]);
				//System.out.println(list);
			}
		}
		answer = new int[list.size()];
		 for(int i = 0; i < list.size(); i++) {
			 System.out.println(list);
			 answer[i] = list.get(i);
		 }
	
	}

}
