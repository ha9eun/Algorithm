import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int[] arr = new int[N];
        for(int j = 0; j < N; j++) {
            for(int k = 0; k < K - 1; k++) {
                int num = queue.poll();
                queue.add(num);
            }
            arr[j] = queue.poll();
        }
        String str = Arrays.toString(arr)
                           .replace("[", "<")
                           .replace("]", ">");
        System.out.println(str);
    }
}