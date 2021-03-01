import java.util.Stack;

public class solution_1 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = 0;
		Stack<Integer> Stack = new Stack<>(); //int형 스택 선언
		
        for(int m:moves){ 
        	int move = m -1;
            for(int j = 0; j < board.length; j++){
            	int b = board[j][move];
            	if(board[j][move] != 0) {
            			if(Stack.size()!=0 && Stack.peek() == board[j][move]) {
            				Stack.pop();
            				answer += 2;
            			}else {
            				Stack.push(board[j][move]);
            			}

            		}else {
            		board[j][move] = 0;
            		break;
            		}
            	}
            }
        }
}
   //     System.out.println(answer);
       // return answer;
	


//pop은 +2를 해야한다
//if(board[j][m] == 0) continue;

//if(board[j][m] != 0) {}
//System.out.println(board[j][m]);   
//System.out.println(stack.size());
//int sum = board[j][num];
// if (sum == 0;)