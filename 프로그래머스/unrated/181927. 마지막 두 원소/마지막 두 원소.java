import java.util.*;

class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        int a = num_list[num_list.length -1]; // 마지막 원소
        int b = num_list[num_list.length -2]; // 마지막 전 원소
        
        for(int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);
        }
        if(a > b){
            answer.add(a - b);
        }else{
            answer.add(a * 2);
        }
        return answer;
    }
}