class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        String[] nums = my_string.split(" ");
        int answer = 0;
       
        for(String num : nums) {
            if(num.equals("")) continue;
            int n = Integer.parseInt(num);
            answer += n;
        }

        return answer;
    }
}