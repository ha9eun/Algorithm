class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int answer = ab >= 2 * a * b ? ab : 2 * a * b;
        return answer;
    }
}