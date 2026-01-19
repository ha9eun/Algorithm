import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int count = 0;
        int i = 0;
        while(i < arr.length) {
            count++;
            if(i <= (arr.length - 3) && isThreeChar(arr, i)) {
                i += 3;
                continue;
            } 
            if(i <= (arr.length - 2) && isTwoChar(arr, i)) {
                i += 2;
                continue;
            }
            i++;
        }
        System.out.println(count);
        br.close();
        
    }
    
    public static boolean isThreeChar(char[] arr, int i) {
        if(arr[i] == 'd' && arr[i + 1] == 'z' && arr[i + 2] == '=') {
            return true;
        }
        return false;
    }
    
    public static boolean isTwoChar(char[] arr, int i) {
        if((arr[i] == 'c' || arr[i] == 's' || arr[i] == 'z') && arr[i + 1] == '=') {
            return true;
        }
        else if((arr[i] == 'l' || arr[i] == 'n') && arr[i+1] == 'j') {
            return true;
        }
        else if((arr[i] == 'c' || arr[i] == 'd') && arr[i + 1] == '-') {
            return true;
        }
        return false;
    }
}