package kr.co.helloWorld.javastudy;

public class middleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String answer = "";
		int s_len = s.length();
		System.out.println(s_len);
	//	System.out.println(s.substring((s_len/2)+1));
	//	System.out.println(s.substring((s_len/2)-1, (s_len/2)+1));
		
		//짝수인경우
		if (s_len % 2 == 0) {
				System.out.println("문자열의 길이가 짝수입니다");
				answer = s.substring((s_len/2)-1, (s_len/2)+1);
				//substring (시작위치, 마지막위치)
				System.out.println(answer);
			
			}else {
				//홀수인경우
				System.out.println("문자열의 길이가 홀수입니다");	
				// CharAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
				answer = String.valueOf(s.charAt(s_len/2));
				System.out.println(answer);
			}
	}

}
