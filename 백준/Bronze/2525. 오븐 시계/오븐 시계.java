import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int time = scan.nextInt();
		scan.close();
		m = m + time;
		if (m >= 60) {
			while (m >= 60) {
				if (h == 23)
					h = 0;
				else
					h++;
				m -= 60;
			}
		}
		
		
		System.out.println(h+" "+m);
		
		
	}

}
