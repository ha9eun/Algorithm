import java.util.ArrayList;
import java.util.List;
    
class Solution {
    public int[] solution(int n) {
        List<Integer> result = new ArrayList<>();
        while(true) {
            result.add(n);
            if (n == 1) break;
            if(n % 2 == 0) {
                n /= 2;
            } 
            else {
                n = 3 * n + 1;
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}