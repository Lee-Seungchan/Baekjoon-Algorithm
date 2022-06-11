import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String string;
        
        while((string = br.readLine()) != null ) {
            StringTokenizer st = new StringTokenizer(string);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
       
            bw.write((a+b) + "\n");
            
            if(a+b==0) break;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}