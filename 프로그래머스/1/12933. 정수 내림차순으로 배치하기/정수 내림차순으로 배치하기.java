import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String strN = String.valueOf(n);
        int[] arrN = new int[strN.length()];
        
        for(int i=0; i<arrN.length; i++){
            arrN[i] = strN.charAt(i) - '0';
        }

        Arrays.sort(arrN);
        
        int[] arrN2 = new int[strN.length()];

        for(int i=0; i<arrN2.length; i++){
            arrN2[i] = arrN[arrN.length-1-i];
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arrN2.length; i++){
            sb.append(arrN2[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}