import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int count = 0;
    int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
    
    String str = Integer.toString(mul);
    
    for(int i=0; i<10; i++) {
      
      for(int j=0; j<str.length(); j++) {
        
        if(str.charAt(j) - '0' == i) count ++;
      }
      bw.write(count + "\n");
      count = 0;
      
    } 
    
      bw.flush();
      bw.close();
      br.close();
    
  }

}
