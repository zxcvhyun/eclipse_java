package first;

public class EnumExam {
	public static final String MALE = "Male";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy"; // ������ �� ������ ���� ������ male.female ���� �ƴ϶� ������ ��
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		//Ư�� ���� ����ؾ��Ѵٸ� �������� ������ ����Ѵ�.
	}
	
}
//������ ����
enum Gender{
	MALE,FEMALE;
}

