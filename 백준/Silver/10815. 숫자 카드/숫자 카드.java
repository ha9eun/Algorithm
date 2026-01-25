import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> cards = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            cards.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        while(st2.hasMoreTokens()) {
            if(cards.contains(Integer.parseInt(st2.nextToken()))) {
                bw.write("1 ");
            } 
            else {
                bw.write("0 ");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}