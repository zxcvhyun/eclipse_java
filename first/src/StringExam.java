
public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello"); //new �����ڸ� �̿��� �ν��Ͻ��� ������ ������ ���� ������.
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		
		if(str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�.");
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�.");
		
		System.out.println(str3.substring(3));
		System.out.println(str3);
	}

}
