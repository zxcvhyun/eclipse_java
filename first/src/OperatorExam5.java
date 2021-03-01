
public class OperatorExam5 {

	public static void main(String[] args) {
		// switch, cas, default, break
		int value = 4;
		
		switch(value) {
			case 1: // 만난 순서부터 모두 출력
				System.out.println("1");
				break; //만나면 빠져나옴
			case 2:
				System.out.println("2");
				break; 
			case 3:
				System.out.println("3");
				break; 
			default :  //else와 비슷한 역할
				System.out.println("그 외");
		}
		
	}

}
