package kr.co.helloWorld.javastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greedy {

	public static void main(String[] args) {
	
		int[] arr1 = {50,5000};
		int[] arr2 = {10,10000};
		int[] arr3 = {100,500};
		greedy(24570, arr1);
		greedy(124150, arr2);
		greedy(9800, arr3);
		/*
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = 0;
				}
			}
		}
		 */
	
	}
	public static void greedy(int n, int[] arr) {
		int[] money = {50000,10000,5000,1000,500,100,50,10};
		int num = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < money.length; i++) {
			int cnt = 0;
			if(arr[0] == money[i]) money[i] = 999999;
			if(arr[1] == money[i]) money[i] = 999999;
			if (n < money[i]) {
				list.add(cnt);
				continue;
			}else {

				while(money[i] <= n) {
					cnt ++;
					n = n - money[i];
					System.out.println(n);					
				}
				list.add(cnt);
			}
		}
		
 		for(int i = 0; i < list.size(); i++) {
			 System.out.print(list.get(i) + " ");
		}			
 		System.out.println();
	}

}
