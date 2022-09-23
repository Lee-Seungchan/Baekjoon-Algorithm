class Solution {
    public long solution(long price, long money, int count) {
        long answer = 0;
        long sum = 0;

        for(int i=1; i<=count; i++) {
            sum += price * i;
        }
        
        
        return (money - sum >= 0) ? 0 : sum - money;
    }
}