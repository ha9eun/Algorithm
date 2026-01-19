class Solution {
    public int solution(String number) {
        int sum = 0;
        for(int i = 0; i < number.length(); i++) {
            String num = String.valueOf(number.charAt(i));
            sum += Integer.parseInt(num);
        }
        return sum % 9;
    }
}