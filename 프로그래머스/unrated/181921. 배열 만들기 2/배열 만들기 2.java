import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i = l; i <= r; i++){
            String str = Integer.toString(i);
            String[] strs = str.split("");
            int numLength = strs.length;
            int count = 0;
            for(int j = 0; j < numLength; j++){
                if(strs[j].equals("0") || strs[j].equals("5")){
                    count++;
                }
            }
            if(count == numLength){
                list.add(i);
            }
        }
        //                     Integer[] -> int[]
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0){
            answer = new int[]{-1};
            return answer;
        }
        return answer;
    }
}