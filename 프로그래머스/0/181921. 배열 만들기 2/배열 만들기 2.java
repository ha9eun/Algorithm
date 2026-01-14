import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer= new ArrayList<>();
        for(int i = 0; i <= 126; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i));
            if (5 * num > r) {
                break;
            } 
            else if (5 * num < l) {
                continue;
            }
            else {
                answer.add(5 * num);
            }
        }
        if (answer.size() == 0) {
            int[] result = {-1};
            return result;
        }
        int[] result = new int[answer.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = answer.get(i).intValue();
        }
        return result;
    }
}