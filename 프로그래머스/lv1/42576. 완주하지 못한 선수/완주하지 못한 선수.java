import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        /*
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<participant.length; i++) {
            list.add(participant[i]);
        }
        
        for(int i=0; i<completion.length; i++) {
            list.remove(completion[i]);
        }
        
        for(int i=0; i<list.size(); i++) {
            answer = list.get(i);
        }
        효율성 테스트 통과 못함 */ 
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for(String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}