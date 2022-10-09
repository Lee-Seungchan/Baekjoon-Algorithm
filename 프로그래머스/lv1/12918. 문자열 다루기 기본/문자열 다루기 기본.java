class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char c = ' ';
        int a = 0;
        
        if(s.length() != 4 && s.length() != 6) return false;
        
        for(int i=0; i<s.length(); i++) {
            c = s.substring(i, i+1).charAt(0);
            a = (int) c;
            
            if(a>=65) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}