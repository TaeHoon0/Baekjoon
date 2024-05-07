class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            int tmp = index;
            while(tmp > 0) {
                c++;
                if(c > 'z') c = 'a';    // z를 넘어가면 a
                if(skip.indexOf(c) == -1) tmp--;    // 현재 문자가 skip에 포함되어 있으면 한 번 더
            }
            sb.append(c);
        } 
        
        return sb.toString();
    }
}