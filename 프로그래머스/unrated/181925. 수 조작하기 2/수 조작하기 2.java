import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < numLog.length; i++){
            int cal = numLog[i] - numLog[i-1];
            if(cal == 1){
                sb.append("w");
            }else  if(cal == -1){
                sb.append("s");
            }else if(cal == 10){
                sb.append("d");
            }else if(cal == -10){
                sb.append("a");
            }
        }
        return sb.toString();
    }
}