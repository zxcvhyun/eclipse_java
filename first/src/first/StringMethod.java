package first;

public class StringMethod {

	public static void main(String[] args) {
		// String str = new String("hello");
		
		String str = "hello world";
		
		System.out.println(str.length());    //���ڿ� ���� 
		System.out.println(str.concat(str)); //���ڿ� ����
		System.out.println(str);
		System.out.println(str.substring(1, 3)); //ù��°���� 3��° ��¥���� �ڸ���.
		System.out.println(str.substring(3));	 //3������ ����Ѵ�
		
	}

}
