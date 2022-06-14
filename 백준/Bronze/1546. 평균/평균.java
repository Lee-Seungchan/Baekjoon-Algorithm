import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    double[] arr = new double[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    for(int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    double sum = 0;
    
    for(int j=0; j<n; j++) {
      sum += grade(arr[j], arr[(n-1)]);
    }
    System.out.println(sum/n);
  }
  
  public static double grade(double v, double max) {
    return v / max * 100;
  }
}