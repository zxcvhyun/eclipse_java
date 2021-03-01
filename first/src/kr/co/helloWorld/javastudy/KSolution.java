package kr.co.helloWorld.javastudy;

import java.util.ArrayList;
import java.util.Arrays;

public class KSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,5,2,6,3,7,4};
		//2번째 부터 5번째 까지 자르면 5263
	//	int [] array2 = Arrays.copyOf(array, array.length);
		int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		//ArrayList<Integer> arrayList = new ArrayList<>();
		
		int i, j, k;
		
		int [] answer = new int[commands.length];
		for (int c = 0; c < commands.length; c++) {
			int [] array2 = Arrays.copyOfRange(array,commands[c][0]-1,commands[c][1]);
			System.out.println(Arrays.toString(array2));
			Arrays.sort(array2);
			answer[c] = array2[commands[c][2]-1];
			System.out.println(answer[c]);
		}
		
	}

}
