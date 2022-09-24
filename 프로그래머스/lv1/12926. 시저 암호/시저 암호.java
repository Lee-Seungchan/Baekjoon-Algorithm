class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] array = new char[s.length()];
        
        for(int i=0; i<s.length(); i++) {
            array[i] = s.charAt(i);
        }
        
        for(int i=0; i<array.length; i++) {
            if(array[i] == ' ') continue;
            for(int j=0; j<n; j++) {
                if(array[i] == 'z') {
                    array[i] = 'a';
                    continue;
                } else if(array[i] == 'Z') {
                    array[i] = 'A';
                    continue;
                }
                array[i] = (char) (array[i] + 1);
            }
        }
        
        for(int i=0; i<array.length; i++) {
            answer += array[i];
        }
        
        return answer;
    }
}