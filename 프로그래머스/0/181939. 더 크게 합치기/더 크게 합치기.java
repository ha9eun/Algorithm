class Solution {
    public int solution(int a, int b) {
        // a와 b의 자릿수
        int b_size = 0;
        int a_size = 0;
        int i = 10;
        while (a_size == 0 || b_size == 0) {
            if (a_size == 0 && a / i < 1) {
                a_size = i;
            }
            if (b_size == 0 && b / i < 1) {
                b_size = i;
            }
            i = i * 10;
        }
        // 값 계산
        int ab = a * b_size + b;
        int ba = b * a_size + a;
        
        // 최대 리턴
        return Math.max(ab, ba);
    }
}