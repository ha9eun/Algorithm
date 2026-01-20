import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for(int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            int idx = ch - 'a';
            if(arr[idx] == -1) {
                arr[idx] = j;
            }
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
        br.close();
    }
}