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
        
        // 처음에 parseint 했을 때 런타임 에러 발생. p의 길이 제약조건이 18 이하임. int로 나타낼 수 있는 최대 자리수는 10자리이고 long은 19자리이기 때문에 long으로 변환해서 풀이해야 함
        return answer;
    }
}