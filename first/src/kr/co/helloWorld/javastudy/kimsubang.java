package kr.co.helloWorld.javastudy;

import java.util.Arrays;

public class kimsubang {

	public static void main(String[] args) {
	
		String[] seoul = {"Jane","Kim"};
		Arrays.sort(seoul);
		int index = Arrays.binarySearch(seoul, "Kim");
		//System.out.println("�輭���� " + index + " �� �ִ�.");

		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				System.out.println(i);
			}
		}
	}

}
