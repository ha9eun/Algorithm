class Solution {
    public int solution(int[] num_list) {
        int prod = 1;
        int pow = 0;
        for(int num : num_list) {
            prod *= num;
            pow += num;
        }
        pow = pow * pow;
        return prod < pow ? 1 : 0; 
        
    }
}