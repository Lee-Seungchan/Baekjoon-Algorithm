import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length]; // 각 유저가 받은 메일 수
        HashMap<String, Integer> idMap = new HashMap<>(); // 유저별 순서 저장
        HashMap<String, HashSet<String>> map = new HashMap<>(); // hashset(key : 유저, value : key를 신고한 유저)
        
        for(int i=0; i<id_list.length; i++) {
            idMap.put(id_list[i], i);
            map.put(id_list[i], new HashSet<>());
        }
        
        // key를 신고한 유저이름 저장
        for(String r : report) {
            String[] str = r.split(" ");
            map.get(str[1]).add(str[0]);
        }
        
        // 신고당한 횟수 > k 이면, 메일 전송
        for(int i=0; i<id_list.length; i++) {
            HashSet<String> set = map.get(id_list[i]);
            if(set.size() >= k) {
                for(String userId : set) {
                    answer[idMap.get(userId)] ++;
                }
            }
        }
            
        return answer;
    }
}