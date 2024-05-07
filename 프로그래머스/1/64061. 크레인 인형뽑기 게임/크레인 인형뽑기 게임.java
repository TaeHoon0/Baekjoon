import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); 
        
        //[세로][가로]
        for(int i = 0; i < moves.length; i++) {
            int crane = moves[i] - 1; // 집게 위치
            // 위에서부터 내려오는 것
            for(int j = 0; j < board.length; j++) {
                if(board[j][crane] != 0) {
                    if(stack.size() > 0 && stack.peek() == board[j][crane]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][crane]);
                    }
                    board[j][crane] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}