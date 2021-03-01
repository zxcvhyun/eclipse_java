package kr.co.helloWorld.javastudy;

public class booleanString {

	public static void main(String[] args) {
		 boolean answer = true;
		 String s = "123a";
		 char tmp;
		 if(s.length() == 4 || s.length() == 6) {
			 answer = true;
		 }else {
			 answer = false;
		 }
		 for(int i = 0; i < s.length(); i++) {
			 tmp = s.charAt(i);
			 System.out.println(tmp);
			 if(Character.isDigit(tmp) == false) {
				 answer = false;
			 }
			 
		 }

		 System.out.println(answer);
		 /*
		 for(int i = 0; i < s.length(); i++) {
			 tmp = s.charAt(i);
			 System.out.println(tmp);
			 
			 if(!(tmp >= '0' && tmp <= '9')) {
				 answer = false;
			 }
		 }
		 System.out.println(answer);
		 */
	}

}
