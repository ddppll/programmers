import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
       
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            else {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}