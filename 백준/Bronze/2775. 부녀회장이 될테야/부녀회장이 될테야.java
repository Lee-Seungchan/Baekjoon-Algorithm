import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 아파트 생성 
		int[][] APT = new int[15][15];
 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;	// 모든 층 1호는 전부 1명
			APT[0][i] = i;	// 0층 i호는 1명씩 증가
		}
 
 
		for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
 
			for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(APT[k][n]);
		}
	}
 
}