class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int num : arr) {
            answer += num;
        }
        answer = (double) answer / arr.length;
        return answer;
    }
}