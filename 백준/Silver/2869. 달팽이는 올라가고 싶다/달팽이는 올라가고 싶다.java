import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
//      Scanner sc = new Scanner(System.in);
//      
//      int A = sc.nextInt();
//      int B = sc.nextInt();
//      int V = sc.nextInt();
//      int rV = 0;
//      int cnt = 0;
//      
//      while(true) {
//        rV = V-(A-B);
//        cnt ++;
//        
//        if(A>=rV) {
//          cnt ++;
//          System.out.println(cnt);
//          break;
//        }
//     }
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
      
      int day = (V-B) / (A-B);
      
      if((V-B) % (A-B) != 0) day++;
      
      System.out.println(day);
     
   }
}