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
		
		//¦���ΰ��
		if (s_len % 2 == 0) {
				System.out.println("���ڿ��� ���̰� ¦���Դϴ�");
				answer = s.substring((s_len/2)-1, (s_len/2)+1);
				//substring (������ġ, ��������ġ)
				System.out.println(answer);
			
			}else {
				//Ȧ���ΰ��
				System.out.println("���ڿ��� ���̰� Ȧ���Դϴ�");	
				// CharAt() : String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ���ִ� �༮
				answer = String.valueOf(s.charAt(s_len/2));
				System.out.println(answer);
			}
	}

}
