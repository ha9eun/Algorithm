import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers[] = new int[9];
		int max = 0;
		int index = -1;
		for (int i = 0; i < 9; i++) {
			numbers[i] = scan.nextInt();
			if (max < numbers[i]) {
				max = numbers[i];
				index = i;
			}
		}
		scan.close();
		
		System.out.println(max);
		System.out.println(index + 1);
		
		
	}	
}