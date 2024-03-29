class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int)Math.ceil((double)my_str.length() / n);
        String[] answer = new String[len];
        System.out.println(len);
        for(int i = 0; i < len; i++) {
            if(i == len - 1) answer[i] = my_str.substring(i * n, my_str.length()); 
            else {
                answer[i] = my_str.substring(i * n, (i+1) * n);
            }
        }

        return answer;
    }
}