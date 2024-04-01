class Solution {
    public int solution(String A, String B) {
        char[] a = A.toCharArray();
        char[] c = new char[a.length];
        int cnt = -1;
        
        for(int i = 0; i < a.length; i++) {
            cnt++;
            
            for(int j = 0; j < a.length; j++) {
                c[j] = a[(a.length - i + j) % a.length];
            }
            
            String s = new String(c);
            if(s.equals(B)) return cnt;
        }
        
        return -1;
    }
}