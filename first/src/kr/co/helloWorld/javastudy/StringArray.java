package kr.co.helloWorld.javastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"abce","abcd","cdx"};
		int n = 2;
		String[] answer = {};
		char temp1 ;
		 ArrayList<String> list = new ArrayList<String>();
	 
		//�ε����� �ִ� ���ڸ� �տ��� ���δ�
		//strings �� ���̸� ���Ѵ�.
        for(int i = 0; i < strings.length; i++){
        	temp1 = strings[i].charAt(n);
        	list.add(temp1+strings[i]);
        	Collections.sort(list);
            System.out.println(list);
        }		
        
        answer = new String[list.size()];
       
 		for(int i = 0; i < list.size(); i++) {
 			 answer[i] = list.get(i).substring(1);
 			 System.out.println(answer[i]);
 		}
     

		
		//�ε��� n�� ���� ã�´�
		//ã�� �ε����� ������ �������� ����
	}

}
