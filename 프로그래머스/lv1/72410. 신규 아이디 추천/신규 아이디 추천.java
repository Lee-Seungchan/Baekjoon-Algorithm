class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1단계 : 소문자로 치환
        answer = new_id.toLowerCase();
        
        //2단계 : 사용 불가능한 문자 제거
        answer = answer.replaceAll("[^a-z0-9\\-_.]*","");
        
        //3단계 : 마침표가 연속해서 나오면 1개만 사용
        answer = answer.replaceAll("\\.{2,}",".");
        
        //4단계 : 처음과 끝에 위치한 마침표 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        //5단계 : 빈문자열이면 a 대입
        if(answer.equals("")) answer = "a";
        
        //6단계 : 문자열 길이 조정
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("^[.]|[.]$","");
        }
        
        //7단계 : 길이가 2자 이하이면, 마지막 문자를 반복 출력
        if(answer.length() < 3) {
            while(answer.length() < 3) {
                answer += answer.substring(answer.length() - 1);
            }
        }
        
        return answer;
    }
}