class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        
        for(int a=0; a<nums.length-2; a++) {
            for(int b=a+1; b<nums.length-1; b++) {
                for(int c=b+1; c<nums.length; c++) {
                    int sum = nums[a] + nums[b] + nums[c];
                    if(check(sum)) answer ++;
                }
            }
        }
        return answer;
    }
    
    public boolean check(int sum) {
            for(int i=2; i<sum; i++) {
                if(sum % i == 0) {
                    return false;
                }
            }
        return true;
    }
}