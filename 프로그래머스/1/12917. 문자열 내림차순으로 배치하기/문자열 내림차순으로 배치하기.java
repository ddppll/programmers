import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] str = s.toCharArray();
		
		Arrays.sort(str);
		
		StringBuilder sb = new StringBuilder(new String(str)); 
		
		answer = sb.reverse().toString();
        
        return answer;
    }
}