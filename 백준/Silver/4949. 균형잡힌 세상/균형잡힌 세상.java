import java.io.*;
import java.util.Stack;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Character> stack = new Stack<>();
    while(true) {
      String s = br.readLine();
      if(s.equals(".")) {
        break;
      }
      boolean isEqual = true;
      for(int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if(ch == '(' || ch == '[') {
          stack.push(ch);
        }
        else if(ch == ')') {
          if(!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
          }
          else {
            isEqual = false;
            break;
          }
        }
        else if(ch == ']') {
          if(!stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
          }
          else {
            isEqual = false;
            break;
          }
        }
      }
      if(stack.isEmpty() && isEqual) {
        bw.write("yes\n");
      }
      else {
        bw.write("no\n");
      }
      stack.clear();

    }
    bw.flush();
    br.close();
    bw.close();
  }
}