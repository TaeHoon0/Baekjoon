class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        String left = "";
        String right = "";
        
        for(int i = 1; i < food.length; i++) {
            int n = food[i] / 2;
            
            for(int j = 0; j < n; j++) sb.append(i);
        }
        
        left = sb.toString(); 
        right = sb.reverse().toString();
        
        answer.append(left).append("0").append(right);
        
        return answer.toString();
    }
}