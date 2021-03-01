package kr.co.helloWorld.javastudy;

import java.util.ArrayList;

public class base3 {

	public static void main(String[] args) {
        int answer = 0;
        int n = 45;
        String str = "";
        String str2 ;
        
        while(n > 0) {
        	str = (n%3) + str; // 문자열 앞에 n을 3으로 나눴을때의 나머지를 더하고 앞에 붙여줌
        	n /= 3; //n을 다시 3으로 나눠준다/	
        }
        System.out.println(str);
        
        char[] arr = str.toCharArray();
        char[] reArr = new char[arr.length];
        for(int i = 0; i<arr.length; i++) {
        	reArr[arr.length-1-i] = arr[i];
        }
        String reStr = new String(reArr);
        System.out.println(reStr);

       int b  = Integer.valueOf(reStr, 3);
       System.out.println(b);
	}

}
