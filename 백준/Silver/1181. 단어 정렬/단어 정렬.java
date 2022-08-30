import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        sc.nextLine(); // nextInt 메소드는 가장 마지막 개행문자(enter)를 제거하지 않아
                       // 다음 호출된 nextLine 메소드에서 개행문자(enter)를 받음
                       // 해당 에러 해결하기 위해 nextLine 메소드 실행
        
        for(int i=0; i<n; i++) {
          arr[i] = sc.nextLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
          public int compare(String str1, String str2) {
            if(str1.length() == str2.length()) {
              return str1.compareTo(str2);
            } else {
              return str1.length() - str2.length();
            }
          }
        });
        
        System.out.println(arr[0]);
        
        for(int i=1; i<n; i++) {
          if(!arr[i].equals(arr[i-1])) {
            System.out.println(arr[i]);
          }
        }
        
        
   }
}