class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            for(int i = s; i <= (e + s) / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[s + e - i];
                arr[s + e - i] = temp;
            }
        }
        return String.valueOf(arr);
    }
}