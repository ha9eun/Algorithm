import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int min = 1000000;
		int max = -1000000;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if ( arr[i] < min) {
				min = arr[i];
			}
			if ( arr[i] > max) {
				max = arr[i];
			}
		}
		
		bw.write(String.valueOf(min));
		bw.write(" ");
		bw.write(String.valueOf(max));
		
		bw.flush();
		bw.close();
		
	}

}
