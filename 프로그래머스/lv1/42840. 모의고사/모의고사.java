import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] st = {1, 2, 3, 4, 5};
        int[] nd = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] rd = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == st[i % st.length]) score[0] ++;
            if(answers[i] == nd[i % nd.length]) score[1] ++;
            if(answers[i] == rd[i % rd.length]) score[2] ++;
        }
        
        // score와 똑같은 array 배열을 생성 후 오름차순 정렬
        int[] array = new int[score.length]; 
        
        for(int i=0; i<score.length; i++) {
            array[i] = score[i];
        }
        
        Arrays.sort(array);
        
        // array[2]에 가장 큰 점수가 위치하며 이 점수와 score[i]가 동일하면 리스트에 넣어줌
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<array.length; i++) {
            if(score[i] == array[2]) {
                list.add(i+1);
            }
        }
        
        // list의 size만큼 배열을 생성한 뒤, 배열에 list 값 넣어줌
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}