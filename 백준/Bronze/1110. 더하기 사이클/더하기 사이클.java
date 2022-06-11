import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        int b = a;
        
        do {
            a = ((a%10) * 10) + (((a/10) + (a%10)) % 10);
            cnt ++;
        } while(a != b);
            
           System.out.println(cnt);
        }
    }