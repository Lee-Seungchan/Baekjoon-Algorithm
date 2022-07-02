import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[26];
        String str = sc.next().toUpperCase();
        
        int max = -1;
        char ch = '?';

        for(int i=0; i<str.length(); i++) {
            arr[str.charAt(i)-65] ++;
            if(max<arr[str.charAt(i)-65]) {
                max = arr[str.charAt(i)-65];
                ch = str.charAt(i);
            } else if(max == arr[str.charAt(i)-65]) {
                ch = '?';
            }
            
        }
        System.out.println(ch);
        
    }
}