package kr.co.helloWorld.javastudy;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Exam2016 {

	//2016�� ���� ��¥�� a�� ������ ��� ���ϱ�
	//IF:5�� �̸� 5-1 �� 3������
	//�׸���  ���� ���� ���� ��¥ (24)�� ���� �� ������ 7�� �Ѵ�


	//2016�� 1�� 1���� �ݿ����Դϴ�
	public static void main(String[] args) {
		int y = 2016;
		int a = 1;
		int b = 1;
		String answer = "";
		int day = 0;
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i = 0; i < a-1; i++) {
			day += month[i];
		}
		day += b - 1;
		
		switch(day%7) {
			case 0 : 
				answer = "FRI";
				break;
			case 1 : 
				answer = "SAT";
				break;
			case 2 : 
				answer = "SUN";
				break;
			case 3 :
				answer = "MON";
				break;
			case 4 : 
				answer = "TUE";
				break;
			case 5 : 
				answer = "WEN";
				break;
			case 6 :
				answer = "THU";
				break;
		}
		System.out.println(answer);
	}

}
