class Solution {
    public int solution(int[] numbers) {
        int first = 0;
        int second = 0;
        
        for(int num : numbers) {
            if (second < num) second = num;
            if (first < second) {
                int temp = first;
                first = second;
                second = temp;
            }
        }
        
        return first * second;
    }
}