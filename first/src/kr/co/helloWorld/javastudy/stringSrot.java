package kr.co.helloWorld.javastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class stringSrot {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		Character [] schar = new Character [s.length()];

		for(int i = 0; i < schar.length; i++) {
			schar[i] = s.charAt(i);
			System.out.println(schar[i]);
		}
		Arrays.sort(schar,Collections.reverseOrder());
		s = "";
		for(int i = 0; i < schar.length; i++) {
			s += schar[i];
		}
		System.out.println(s);
		//Collections.reverse(Arrays.asList(schar));
		//System.out.println(schar);
		//만약 A-Z면 맨 뒤에

	}

}

