import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len = S.length();
        HashSet<String> set = new HashSet<>();
        for(int i = 1; i <= len; i++) {
            for(int j = 0; j <= len - i; j++) {
                set.add(S.substring(j, j + i));
            }
        }
        System.out.println(set.size());
        br.close();
    }
}