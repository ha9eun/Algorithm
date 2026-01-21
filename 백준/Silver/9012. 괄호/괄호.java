import java.io.*;
import java.util.Stack;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < T; i++) {
      String s = br.readLine();
      for(int j = 0; j < s.length(); j++) {
        char ch = s.charAt(j);
        if(ch == '(') {
          stack.push(ch);
        }
        else {
          if(!stack.isEmpty()) {
            stack.pop();
          }
          else {
            stack.push(ch);
            break;
          }
        }
      }
      if(!stack.isEmpty()){
        bw.write("NO\n");
        stack.clear();
      }
      else {
        bw.write("YES\n");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}