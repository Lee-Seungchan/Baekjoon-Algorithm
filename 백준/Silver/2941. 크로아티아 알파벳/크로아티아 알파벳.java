import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String[] str2 = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
       
       for(int i=0; i<str2.length; i++) {
         if(str.contains(str2[i])) {
           str = str.replace(str2[i], "!");
         }
       }
       
       System.out.println(str.length());
       
    }
}