class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        Long num2 = Long.valueOf(num);
        
        while(true){

            if(num2==1 || count>=500) break;

            count++;

            if(num2%2==0){
                num2 /= 2;
            }
            else{
                num2 = num2 * 3 + 1;
            }

        }
        
        if(num2==1) answer = count;
        else answer = -1;
        
        return answer;
    }
}