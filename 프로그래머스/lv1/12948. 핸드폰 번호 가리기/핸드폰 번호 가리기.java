class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String str = "";
        
        for(int i=0; i<phone_number.length() - 4; i++) {
            str += "*";
        }
        
        return str + phone_number.substring(phone_number.length() -4, phone_number.length());
    }
}