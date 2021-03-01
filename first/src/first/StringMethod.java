package first;

public class StringMethod {

	public static void main(String[] args) {
		// String str = new String("hello");
		
		String str = "hello world";
		
		System.out.println(str.length());    //문자열 길이 
		System.out.println(str.concat(str)); //문자열 결합
		System.out.println(str);
		System.out.println(str.substring(1, 3)); //첫번째부터 3번째 글짜까지 자른다.
		System.out.println(str.substring(3));	 //3번부터 출력한다
		
	}

}
