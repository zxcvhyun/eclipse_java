package kr.co.helloWorld.javastudy;

public class TwoIntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long answer = 0;
        int a = 5;
        int b = 3;
        
      
        //a�� b�� ������ �ƹ� ���� �����Ѵ�.
        if(a==b) {
        	answer = a;
        	System.out.println(a);
        }else if(a < b){
        	for(int i = a; i <= b; i++) {
        		answer += i;
        		System.out.println(answer);
        	}
        }else if(a > b) {
        	for(int i = b; i <= a; i++) {
        		answer += i;
        		System.out.println(answer);
        	}
        }

	}

}
