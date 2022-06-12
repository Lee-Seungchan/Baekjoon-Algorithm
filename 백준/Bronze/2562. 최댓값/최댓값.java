import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        int max = arr[0];
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                cnt = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(cnt);
        
    }
}