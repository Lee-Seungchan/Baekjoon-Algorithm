import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] arr = new int[s.length()];
        int num = 0;
        char ch1 = ' ';
        for(int i=0; i<s.length(); i++) {
            ch1 = s.charAt(i);
            num = (int) ch1;
            arr[i] = num;
        }
        
        Arrays.sort(arr);
        char ch2 = ' ';
        for(int i=arr.length -1; i>=0; i--) {
            ch2 = (char) arr[i];
            answer += ch2;
        }
        
        return answer;
    }
}