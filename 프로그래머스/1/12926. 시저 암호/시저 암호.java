class Solution {
    public String solution(String s, int n) {
        
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' ') {
                answer += ' ';
                continue;
            }        
            int range = Character.isUpperCase(arr[i]) ? 65 : 97;
            int gap = (arr[i] - range + n) % 26;
            answer += (char)(range + gap);       
        }
        return answer;
    }
}