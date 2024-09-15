class Solution {
    public long solution(int price, int money, int count) {
        
        long answer = -1;
		long price2 = 1;
		long total = 0;
		
		for(int i=1; i<=count; i++) {
			price2 = i*price;
			total += price2;
		}
		
		if(money<total) answer = total - money;
		else answer = 0;

        return answer;
    }
}