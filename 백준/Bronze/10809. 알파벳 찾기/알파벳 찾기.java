import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        String str = br.readLine();
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }
        
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        } 
        
        for(int i=0; i<26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}