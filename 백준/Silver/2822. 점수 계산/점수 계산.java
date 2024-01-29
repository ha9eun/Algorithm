import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제의 점수 8개를 받아서
		// 가장 높은 점수 5개의 합 출력
		// 최종 점수에 포함된 문제 번호 오름차순으로 출력
		int[] scores = new int[8];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			scores[i] = scan.nextInt();
		}
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		Arrays.sort(scores2);
		int sum = 0;
		int[] index = new int[5];
		for (int i = 3; i < 8; i++) {
			sum += scores2[i];
			for (int j = 0; j < 8; j++) {
				if (scores[j] == scores2[i]) {
					index[i-3] = j + 1;
					break;
				}
					
			}
		
		}
		Arrays.sort(index);
		System.out.println(sum);
		for(int i = 0; i < 5; i++) {
			System.out.print(index[i]+" ");
		}
	}

}
