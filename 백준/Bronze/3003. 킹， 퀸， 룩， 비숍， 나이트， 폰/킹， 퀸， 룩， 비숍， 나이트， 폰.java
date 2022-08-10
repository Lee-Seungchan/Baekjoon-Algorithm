import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[6];
        int[] a = new int[]{1, 1, 2, 2, 2, 8};
        
        for(int i=0; i<6; i++) {
            n[i] = sc.nextInt();
        }
        
        for(int i=0; i<a.length; i++) {
            n[i] = a[i] - n[i];
            System.out.print(n[i] + " ");
        }
    }
}