import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(happy(n) ? "HAPPY" : "UNHAPPY");
        }
        
        static boolean happy(int n) {
            int slow = Calculator(n);
            int fast = Calculator(Calculator(n));
            
            while(slow != 1 && fast != 1) {
                if(slow == fast) {
                    return false;
                }
                
                slow = Calculator(slow);
                fast = Calculator(Calculator(fast));
            }
            
            return true;
        }
    
        static int Calculator(int num) {
            int sum = 0;
            
            while (num != 0) {
            sum += (num % 10) * (num % 10);
            num /= 10;
            }
            
            return sum;
        }
}