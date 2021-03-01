import java.util.Scanner;

public class OperatorExam6 {

	public static void main(String[] args) {
//		int i = 0;
//				
//		while(i < 10) {
//			System.out.println(i);
//			i++; //i = i+1;
//		}

//		int total = 0;
//		int i = 1;
//		while(i <= 100) {
//			total = total + i;
//			i++;
//		}
//		System.out.println(total);
		int i = 1;
		while(i < 11) {
			i++;
			if (i % 2 == 0 ) {
				System.out.println(i);
			}
		}
//---		
		int value = 0;
		/* Sca만 치신 후에 Ctrl + space bar를 누르시면 자동으로 완성해주는 단어의 목록이 뜨는데요 
		  이 중에서 Scanner - java.util 이라고 되어있는 부분으로 단어를 완성하시면 자동으로 import java.util.Scanner; 가 추가됩니다*/
		Scanner scan = new Scanner(System.in); //키보드로부터 입력 된 값을 받는 부분
		        //
		do {
			// 반복 할 문장들 - 무조건 한번은 수행
			value = scan.nextInt(); //정수값을 입력받아 value에 넣음
			System.out.println("입력받은 값: " + value);
			
		}while(value != 10);//조건을 비교해서 만족하면 do로 올라가서 수행
		System.out.println("반복문 종료");
	}

}
