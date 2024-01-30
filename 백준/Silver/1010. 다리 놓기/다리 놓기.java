import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static BigInteger fact(int a) {
        BigInteger result = BigInteger.ONE;
        for (int i = a; i >= 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        BigInteger[] answer = new BigInteger[num];
        
        for (int i = 0; i < num; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            // BigInteger로 변환하여 계산
            answer[i] = fact(m).divide(fact(n).multiply(fact(m - n)));
        }
        scan.close();
        
        for (int i = 0; i < num; i++)
            System.out.println(answer[i]);
    }
}
