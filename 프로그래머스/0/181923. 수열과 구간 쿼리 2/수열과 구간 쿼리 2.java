class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int j = 0;
        for(int[] query : queries) {
            for(int i = query[0]; i <= query[1]; i++) {
                if (arr[i] > query[2]) {
                    if (answer[j] == '\0' || answer[j] > arr[i]) {
                        answer[j] = arr[i];
                    }
                }
            }
            if (answer[j] == '\0') {
                answer[j] = -1;
            }
            j++;
        }
        return answer;
        
    }
}