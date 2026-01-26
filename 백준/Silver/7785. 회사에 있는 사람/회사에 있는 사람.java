import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> names = new HashSet<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(st.nextToken().equals("enter")) {
                names.add(name);
            } 
            else {
                names.remove(name);
            }
        }
        ArrayList<String> list = new ArrayList<String>(names);
        Collections.sort(list, Collections.reverseOrder());
        for(String s : list) {
            System.out.println(s);
        }
    }
}