import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    boolean[] arr = new boolean[42];
    int cnt = 0;
    
    for(int i=0; i<10; i++) {
      int n = Integer.parseInt(br.readLine());
      arr[n % 42] = true;
    }
    
    for(boolean b : arr) {
      if(b) cnt ++;
    }
    System.out.println(cnt);
    
    
  }

}