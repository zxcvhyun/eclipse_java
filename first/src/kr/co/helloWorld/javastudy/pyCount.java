package kr.co.helloWorld.javastudy;

public class pyCount {

	public static void main(String[] args) {
		boolean answer = true;
		String s = "pPoooyY";
		char tmp;
		int pcnt = 0 ;
		int ycnt = 0 ;
		// p�� y�� ������ ������ true (��Ҥù��� ���� ����) 
		// p�� ���� ī��Ʈ / y�� ���� ī��Ʈ �ؼ� ��
		// Pyy �פ� ��� false
		
		for(int i = 0; i < s.length(); i++) {
			tmp = s.charAt(i);
			//System.out.println(tmp);
			if(tmp == 'P' || tmp == 'p') {
				pcnt ++;
				System.out.println(pcnt);
			}
			if(tmp == 'Y' || tmp == 'y') {
				ycnt ++;
				System.out.println("Y: " + ycnt);
			}
			
			if(pcnt != ycnt) {
				answer = false;
			}else {
				answer = true;
			}
			
		}
		System.out.println(answer);
		
	}

}
