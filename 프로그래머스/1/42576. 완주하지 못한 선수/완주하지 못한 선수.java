import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String name : participant) {
            if(hashMap.containsKey(name)) {
                int count = hashMap.get(name);
                hashMap.put(name, count + 1);
            }
            else {
                hashMap.put(name, 1);
            }
        }
        for(String name : completion) {
            int count = hashMap.get(name);
            if (count == 1) {
                hashMap.remove(name);
            } 
            else {
                hashMap.put(name, count - 1);
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for(String key : hashMap.keySet()) {
            sb.append(key);
        }
        return sb.toString();
        
    }
}