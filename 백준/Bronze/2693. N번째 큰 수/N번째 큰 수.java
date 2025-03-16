
import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 테스트 케이스 개수 입력받기
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];
        //각 테스트 케이스는 자연수 10개짜리 배열
        for(int i = 0; i < n; i++){
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            quickSort(arr, 0, arr.length - 1);
            answer[i] = arr[7];

        }
        for(int i = 0; i < n; i++){
            bw.write(answer[i] + "\n");
        }
        //각 테스트케이스의 3번째 큰값 출력
        bw.flush();
        bw.close();
        br.close();
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left >= right) return;

        int pivot = arr[(left + right) / 2];
        int i = left, j = right;

        while(i <= j) {
            while(arr[i] < pivot) i++;
            while(arr[j] > pivot) j--;
            if(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(arr, left, j);
        quickSort(arr, i, right);

    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}
