class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = Integer.toString(x);
        int cnt = 0;
        
        for(int i=0; i<str.length(); i++) {
            cnt += Integer.parseInt(str.substring(i, i+1));
        }
        
        return x % cnt == 0 ? true : false;
    }
}