import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int cnt = 1;
        
        while(cnt != n) {
            num ++;
            if(String.valueOf(num).contains("666")) cnt++;
        }
        System.out.println(num);
    }
}

// 참고 : https://st-lab.tistory.com/103
// 입력값과 cnt가 같아질 때 까지 num을 1씩 증가시켜 666이 포함되는지 검사