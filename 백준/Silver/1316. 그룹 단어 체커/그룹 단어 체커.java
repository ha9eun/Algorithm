import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int groupWord = 0;
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            int[] count = new int[26];
            boolean isGroup = true;
            for(int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (count[ch - 'a'] == 0 || ch == s.charAt(j - 1)) {
                    count[ch - 'a']++;
                } 
                else {
                    isGroup = false;
                    break;
                }
            }
            if(isGroup) {
                groupWord++;
            }
        }
        System.out.print(groupWord);
        br.close();
    }
}