package kr.co.helloWorld.javastudy;

import java.util.ArrayList;

public class base3 {

	public static void main(String[] args) {
        int answer = 0;
        int n = 45;
        String str = "";
        String str2 ;
        
        while(n > 0) {
        	str = (n%3) + str; // ���ڿ� �տ� n�� 3���� ���������� �������� ���ϰ� �տ� �ٿ���
        	n /= 3; //n�� �ٽ� 3���� �����ش�/	
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
