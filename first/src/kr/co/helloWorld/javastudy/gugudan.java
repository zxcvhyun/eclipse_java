package kr.co.helloWorld.javastudy;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
        //printGugu(5);
		int n = 5 ;
	
		printGugu(n);
		//System.out.println(printGugu());
    }
    public static void printGugu(int n)
    {
    	int i = 1;
    	int gugu = 0;
	      if (i > 9)
	      {
	          return ;
	      }
	      gugu = n * i+1;
	     
	      //System.out.printf("%d\n", n*i);
	     // printGugu(n, i+1);
	      System.out.println(gugu);
  }


	
		
}
