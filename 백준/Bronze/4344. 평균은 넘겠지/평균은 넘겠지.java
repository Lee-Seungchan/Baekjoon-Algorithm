import java.io.*;
import java.util.*;


public class Main {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
   
    int sum = 0;
    double avg = 0;
    double aboveAvg = 0;
    
    for(int i=0; i<N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int num = Integer.parseInt(st.nextToken());
      double[] arr = new double[num];
      sum = 0;
      aboveAvg = 0;
      
      for(int j=0; j<num; j++) {
        arr[j] = Integer.parseInt(st.nextToken());
        sum += arr[j];
      }
      avg = sum/num;
    
      for(int j=0; j<arr.length; j++) {
        if(arr[j]>avg) aboveAvg ++;
      }
    
    System.out.println(String.format("%.3f", aboveAvg/num*100)+"%");
    }
  }
}