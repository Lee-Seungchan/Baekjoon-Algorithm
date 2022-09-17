class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String str =  "";
        String reverse_str = "";
        String[] array1 = new String[n];
        String[] array2 = new String[n];
        
        // arr1 10진수 → 2진수 변환
        for(int i=0; i<arr1.length; i++) {
            while(arr1[i] != 0) {
                str += Integer.toString(arr1[i] % 2);
                arr1[i] /= 2;
            }
            
            // 2진수로 변경 후 부족한 자릿값을 0으로 채워줌
            if(str.length() < n) {
                int num = n - str.length();
                for(int j=0; j<num; j++) {
                    str += 0;
                }
            }

            // 값을 뒤집어줘야 정확한 이진수 값이 나옴
            reverse_str = new StringBuffer(str).reverse().toString();
            array1[i] = reverse_str;
            str = "";
        }
    
        // arr2 10진수 → 2진수 변환
        for(int i=0; i<arr2.length; i++) {
            while(arr2[i] != 0) {
                str += Integer.toString(arr2[i] % 2);
                arr2[i] /= 2;
            }
 
            if(str.length() < n) {
                int num = n - str.length();
                for(int j=0; j<num; j++) {
                    str += 0;
                }
            }
          
            reverse_str = new StringBuffer(str).reverse().toString();
            array2[i] = reverse_str;
            str = "";
        }
      
        //각 지도를 합쳐 최종 지도 산출  
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(array1[i].substring(j, j+1).equals("1") || array2[i].substring(j, j+1).equals("1")) {
                    str += "#";
                } else {
                    str += " ";
                }
            }
            answer[i] = str;
            str = "";
        }
        
        return answer;
    }
}