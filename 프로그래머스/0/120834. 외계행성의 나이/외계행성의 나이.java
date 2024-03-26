class Solution {
    public String solution(int age) {
        String str = Integer.toString(age);
        StringBuilder sb = new StringBuilder();
        
        for(char c : str.toCharArray()) {
            int n = c - '0';
            sb.append((char)('a' + n));
        }
        
        return sb.toString();
    }
}