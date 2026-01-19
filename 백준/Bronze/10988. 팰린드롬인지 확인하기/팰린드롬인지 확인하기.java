import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int s = 0;
        int e = arr.length - 1;
        while(s < e) {
            if(arr[s] != arr [e]) {
                System.out.println(0);
                br.close();
                return;
            } 
            s++;
            e--;
        }
        br.close();
        System.out.println(1);
        
    }
}