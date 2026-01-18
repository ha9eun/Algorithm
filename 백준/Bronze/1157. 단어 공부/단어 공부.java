import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        int[] arr = new int[26];
        for(char c : str.toCharArray()) {
            arr[c - 'A']++;
        }
        int max = -1;
        char result = '?';
        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result = (char) (i + 'A');
            } 
            else if(arr[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
        br.close();
    }
}