class Solution {
    public String solution(int n) {
        
        String a = "수";
		String b = "박";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
			if(i%2==0) sb.append(a);
			else sb.append(b);
		}
		
        String answer = sb.toString();
        
        return answer;
    }
}