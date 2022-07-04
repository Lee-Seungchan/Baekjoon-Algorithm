import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int cnt = 0;
      
      for(int i=0; i<a; i++) {
        String str = sc.next();
        boolean check[] = new boolean[26]; // 알파벳
        boolean tmp = true; // 그룹단어
        
        for(int j=0; j<str.length(); j++) {
          int index = str.charAt(j) -'a';
          if(check[index]) { // 이전에 사용한 적이 있는 문자일 경우
            if(str.charAt(j) != str.charAt(j-1)) { // 이전 문자와 연속 X
              tmp = false;
              break;
            }
          } else { //  이전에 사용한 적 X
              check[index] = true;
          }
        }
        
        if(tmp) cnt++;
        
      }

      System.out.println(cnt);
      
    }
}