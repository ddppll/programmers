class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        String a = "";
        for(int i=0; i<t.length(); i++){
            if(i+p.length()<=t.length()) {
                a = t.substring(i, i+p.length());
                if(Long.parseLong(a)<=Long.parseLong(p)) answer++;
            }
        }
        return answer;
    }
}