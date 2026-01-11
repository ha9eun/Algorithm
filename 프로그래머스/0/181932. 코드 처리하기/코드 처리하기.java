class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        char c[] = code.toCharArray();
        for(int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (c[idx] == '1') {
                    mode = 1;
                }
                else if (idx % 2 == 0) {
                    sb.append(c[idx]);
                }
            }
            else if (mode == 1) {
                if (c[idx] == '1') {
                    mode = 0;
                }
                else if (idx % 2 != 0) {
                    sb.append(c[idx]);
                }
            }
        }
        
        String ret = sb.toString();
        if (ret.length() == 0) {
            return "EMPTY";
        } 
        else  {
            return ret;
        }
    }
}