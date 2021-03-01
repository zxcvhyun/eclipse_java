package kr.co.helloWorld.javastudy;


public class gugudan2 {
    public static void main(String[] args)
    {
        //printGugu(5);
		int n = 5 ;
		int i = 1;
		printGugu(n, i);
		//System.out.println(printGugu());
    }
    public static void printGugu(int n, int i)
    {
      if (i > 9)
      {
          return ;
      }
      System.out.printf("%d\n", n*i);
      printGugu(n, i+1);
  }



	
		
}
