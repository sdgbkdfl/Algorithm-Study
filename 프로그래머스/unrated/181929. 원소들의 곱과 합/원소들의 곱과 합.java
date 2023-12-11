class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int prod = 1;
        
        for(int i = 0;i < num_list.length;i++){
            sum += num_list[i];
            prod *= num_list[i];
        }
        if(prod < sum*sum){
            return prod = 1; 
         }else{
             return sum = 0;
        }
       
    }
}