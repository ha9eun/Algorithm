import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        if (arr[0] == arr[3]) {
            return a * 1111;
        }
        else if (arr[0] == arr[2] || arr[1] == arr[3]) {
            int q = (arr[0] == arr[1]) ? arr[3] : arr[0];
            return (int) Math.pow(10 * arr[1] + q, 2);
        } 
        else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            return arr[2] * arr[2] - arr[0] * arr[0];
        }
        else if(arr[0] == arr[1]) {
            return arr[2] * arr[3];
        }
        else if(arr[1] == arr[2]) {
            return arr[0] * arr[3];
        }
        else if(arr[2] == arr[3]) {
            return arr[0] * arr[1];
        }
        else {
            return arr[0];
        }
        
        
    }
}