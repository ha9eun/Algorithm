import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> pokemons = new HashMap<>();
        HashMap<String, Integer> nums = new HashMap<>();
        for(int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            pokemons.put(i, pokemon);
            nums.put(pokemon, i);
        }
        for(int j = 0; j < M; j++) {
            String s = br.readLine();
            if( 'A' <= s.charAt(0) && s.charAt(0) <= 'Z') {
                bw.write(nums.get(s) + "\n");
            } 
            else {
                bw.write(pokemons.get(Integer.parseInt(s)) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}