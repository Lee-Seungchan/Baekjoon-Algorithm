import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        
        // n의 각 숫자를 배열에 넣어준다.
        for(int i=0; i<str.length(); i++) {
            String substring = str.substring(i, i+1);
            int subint = Integer.parseInt(substring);
            arr[i] = subint;
        }
        
        // 내림차순으로 정렬 후 마지막 값부터 반대로 꺼내준다.
        Arrays.sort(arr);
        String str2 = "";
        for(int i=arr.length-1; i>=0; i--) {
            str2 += Integer.toString(arr[i]);
        }
        
        // retrun 타입으로 형변환
        answer = Long.parseLong(str2);

        return answer;
    }
}