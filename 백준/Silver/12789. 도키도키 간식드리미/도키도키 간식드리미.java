import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int turn = 1;
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() == turn) {
                stack.pop();
                turn++;
            }
        }
        if(stack.isEmpty()) {
            bw.write("Nice");
        } 
        else {
            bw.write("Sad");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}