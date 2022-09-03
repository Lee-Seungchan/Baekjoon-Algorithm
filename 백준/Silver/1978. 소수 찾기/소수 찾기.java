import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			
			boolean a = true; // 소수 판별
            
			int num = sc.nextInt();
			
			if(num == 1) {
				continue;
			}
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					a = false;	// 소수가 아니므로 false로 바꿈
					break;
				}
			}
			if(a) {	// a == true
				cnt++;
			}
		}
		System.out.println(cnt);
	}
 
}