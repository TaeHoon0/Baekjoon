class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {     
            if(c >= 'a' && c <= 'z') {
                c = ((char)(c + n) > 'z') ? (char)(c - 26 + n) : (char)(c + n);
                sb.append(c);
            }
            else if(c >= 'A' && c <= 'Z') {
                c = (char)(c + n) > 'Z' ? (char)(c - 26 + n) : (char)(c + n);
                sb.append(c);
            } else {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}