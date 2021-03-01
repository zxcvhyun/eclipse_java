package kr.co.helloWorld.javastudy;
import java.util.Arrays;
public class CompletionTest {

	public static void main(String[] args) {
		String[] participant = new String[] {"leo","kiki","eden"};
		String[] compeltion  = new String[] {"eden","kiki"};	
		//Map<String, String> map = new HashMap<>();
		int i = 0;
		Arrays.sort(participant);
		Arrays.sort(compeltion);
		
		//System.out.println(Arrays.toString(participant));
		//System.out.println(Arrays.toString(compeltion));
		
		for (i = 0; i < compeltion.length; i++) {
			if(!participant[i].equals(compeltion[i])) {
				System.out.println(participant[i]);
			}
		}
		System.out.println(participant[i]);

	}
	

}
