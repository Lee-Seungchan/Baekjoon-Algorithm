import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = n;
        
        for(int i=m; i<=n; i++) {
            boolean chk = true;
            if(i == 1) chk = false;

            // 자신의 이전값까지 나누어지는지 확인
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    chk = false;
                    break;
                }
            }
            
            if(chk) {
                if(min > i) min = i;
                sum += i;
            }
        }
        
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
        
    }
}