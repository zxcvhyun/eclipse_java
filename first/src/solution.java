import java.util.Stack;

public class solution {

   public static void main(String[] args) {
      int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
      int[] moves = {1,5,3,5,1,2,1,4};
      
      int answer = 0;
      Stack<Integer> Stack = new Stack<>(); //int형 스택 선언
      
      
      //n^2
        for(int i = 0; i < moves.length; i ++){ 
           int m = moves[i] - 1;
           System.out.println("move의 값:" + m);
           
            for(int j = 0; j < board.length; j++){
            	System.out.println("board의 값 :" + j);
              // int b = board[j][m];
               if(board[j][m] != 0) {
                  if(!Stack.empty()) {
                     if(Stack.size()!=0 && Stack.peek() == board[j][m]) {             
                        Stack.pop();
                        
                        answer += 2;
                     }else {
                        Stack.push(board[j][m]);
                     }
                     
                  }else {
                     Stack.push(board[j][m]);
                     
                  }
                 
                  System.out.println(Stack);
                  
                  board[j][m] = 0;
                  break;
               }
            }
        }
        System.out.println(answer);
       // return answer;                                                                                                                                                                                                                                   
   }

}

//if(board[j][m] == 0) continue;

//if(board[j][m] != 0) {}
//System.out.println(board[j][m]);   
//System.out.println(stack.size());
//int sum = board[j][num];
// if (sum == 0;)