class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int a = 0; // 가로
        int b = 0; // 세로
        
        for(int i=0; i<sizes.length; i++) {
            
            // a, b 값 중 큰 값을 가로에 넣어줌
            if(sizes[i][0] < sizes[i][1]) {
                int c = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = c;
            }
            
            if(a < sizes[i][0]) {
                a = sizes[i][0];
            }
            
            if(b < sizes[i][1]) {
                b = sizes[i][1];
            }
            
        }
        
        answer  = a*b;

        return answer;
    }
}