import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    list.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
             
        }
        
        System.out.println(list);
        
        for(int i=0; i<list.size(); i++) {
            if(i==0) continue;
            else if(list.get(i) == list.get(i-1)){
                list.remove(i);
                list.remove(i-1);
                answer += 2;
                i -= 2;
            }
        }
        
        return answer;
    }
}