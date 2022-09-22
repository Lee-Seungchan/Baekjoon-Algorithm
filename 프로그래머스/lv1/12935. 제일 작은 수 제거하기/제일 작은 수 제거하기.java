import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int min = arr2[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != min) list.add(arr[i]);
        }
        
        int[] answer;
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        
        
        return answer;
    }
}