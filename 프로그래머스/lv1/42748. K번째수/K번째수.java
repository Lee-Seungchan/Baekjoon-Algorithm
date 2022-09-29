import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(int i=0; i<commands.length; i++) {
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];
            int[] arr = new int[b-a+1];
            int cnt = a-1;
            
            for(int j=0; j<arr.length; j++) {
                arr[j] = array[cnt];
                cnt ++;
            }
            
            Arrays.sort(arr);
            answer[i] = arr[c-1];
        }
        
        return answer;
    }
}