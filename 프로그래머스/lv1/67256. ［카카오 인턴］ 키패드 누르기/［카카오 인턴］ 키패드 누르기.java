class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left_location = 10;
        int right_location = 12;
        
        for(int i : numbers) {
            if(i % 3 == 1) {
                answer += "L";
                left_location = i;
            }
            else if(i==3 || i==6 || i==9) {
                answer += "R";
                right_location = i;
            }
            else {
                if(i==0) i = 11;
                int ld = (Math.abs(i-left_location))/3 + (Math.abs(i-left_location))%3;
                int rd = (Math.abs(i-right_location))/3 + (Math.abs(i-right_location))%3;
                
                if(ld == rd) {
                    if(hand.equals("left")) {
                        answer += "L";
                        left_location = i;
                    } else {
                        answer += "R";
                        right_location = i;
                    }
                } else if(ld > rd) {
                    answer += "R";
                    right_location = i;
                } else {
                    answer += "L";
                    left_location = i;
                }
            }
        }
        
        return answer;
    }
}