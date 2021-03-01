package first;

public class EnumExam {
	public static final String MALE = "Male";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy"; // 컴파일 상에 문제는 되지 않지만 male.female 값이 아니라 오류가 남
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		//특정 값만 사용해야한다면 열거형을 가져다 사용한다.
	}
	
}
//열거형 변수
enum Gender{
	MALE,FEMALE;
}

