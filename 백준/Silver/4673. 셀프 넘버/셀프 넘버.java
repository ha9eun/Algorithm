import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> preNums = new ArrayList<>();


		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 0; d < 10; d++) {
						int preNum = 1001 * a + 101 * b + 11 *c + 2 * d;
						if (preNum <= 10000)
							preNums.add(preNum);
						else
							break;
					}
				}
			}
		}

		for (int i = 1; i <= 10000; i++) {
			if (!preNums.contains(i))
				System.out.println(i);
		}
	}
}
