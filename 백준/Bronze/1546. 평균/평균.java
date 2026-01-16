import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer; 
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      sum += arr[i];
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    double answer = (double) sum / N / max * 100;
    bw.write(String.valueOf(answer));
    bw.flush();
    br.close();
    bw.close();
  }
}