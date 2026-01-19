class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            String sub = sb.substring(s, e + 1);
            StringBuilder temp = new StringBuilder(sub).reverse();
            sb.replace(s, e + 1, temp.toString());
        }
        return sb.toString();
    }
}