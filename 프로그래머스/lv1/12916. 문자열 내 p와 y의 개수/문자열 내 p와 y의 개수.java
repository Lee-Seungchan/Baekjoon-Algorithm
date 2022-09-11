class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt_p = 0;
        int cnt_y = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.substring(i, i+1).equals("p") || s.substring(i, i+1).equals("P")) {
                cnt_p ++;
            } else if(s.substring(i,i+1).equals("y") || s.substring(i,i+1).equals("Y")) {
                cnt_y ++;
            }
        }
        
        if(cnt_p == cnt_y) answer = true;
        else answer = false;

        return answer;
    }
}