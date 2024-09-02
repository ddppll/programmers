class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int y = x;
        int a = 0;
        
        while(y>0){
            a += y%10;
            y /= 10;
        }
        
        if(x%a != 0) answer = false;
        
        return answer;
    }
}