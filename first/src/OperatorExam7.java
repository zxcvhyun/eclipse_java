
public class OperatorExam7 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0) {
//				continue; // continue를 만나면 아래의 반복문은 시행하지 않고 다시 맨 위 반복문으로 올라감
//			}
			if(i == 50) {
				break;    // break를 만나면 만난 지점에서 반복문을 빠져나옴
			}
			total = total + i;
		}
		System.out.println(total);
	}

}
