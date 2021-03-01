package kr.co.helloWorld.javastudy;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Exam2016 {

	//2016년 이후 날짜를 a달 전까지 모두 더하기
	//IF:5월 이면 5-1 한 3월까지
	//그리고  더한 값에 현재 날짜 (24)를 더한 뒤 나누기 7을 한다


	//2016년 1월 1일은 금요일입니다
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
