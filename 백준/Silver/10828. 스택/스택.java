import java.util.*;

public class Main {
  
    public static Stack<Integer> stack = new Stack<>();
    
    public static void main(String[] args)  {
      
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      int n = sc.nextInt();
       
      for(int i=0; i<n; i++) {
         
        String str = sc.next();
        
        switch(str) {
        case "push" :
          int a = sc.nextInt();
          stack.push(a);
          break;
        
        case "pop" :
          sb.append(pop()).append("\n");
          break;
          
        case "size":
          sb.append(size()).append('\n');
          break;

        case "empty":
          sb.append(empty()).append('\n');
          break;

        case "top":
          sb.append(top()).append('\n');
          break;
        }
      }
      
      System.out.println(sb);
    }
       
    
    public static int pop() {
      if (stack.isEmpty()) {
        return -1;
      } else {
        int tmp = stack.peek(); // 최근에 추가된 top 데이터 조회
        stack.pop(); // 최근에 추가된 top 데이터 삭제
        return tmp;
      }
    }

    public static int size() {
      return stack.size(); // 스택에 들어있는 정수 개수 출력
    }

    public static int empty() {
      if (stack.isEmpty()) {
        return 1;
      } else {
        return 0;
      }
    }

    public static int top() {
      if (stack.isEmpty()) {
        return -1;
      } else {
        return stack.peek();
      }
    }
   
}