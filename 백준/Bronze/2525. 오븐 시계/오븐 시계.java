import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h, m, n;
		
		h = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();
		
		int a = (60*h) + m + n;
		h = a / 60;
		m = a % 60;
	
		if(h>=24) h-=24;
		
		System.out.println(h + " " + m);
	}
}
