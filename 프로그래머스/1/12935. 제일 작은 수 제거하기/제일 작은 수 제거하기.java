import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int min = 0;
        int number = 0;
        
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        
        int answer[] = new int[arr.length-1];
        min = Arrays.stream(arr).min().getAsInt();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min){
                answer[number] = arr[i];
                number++;
            }
        }
        
        return answer;
    }
}