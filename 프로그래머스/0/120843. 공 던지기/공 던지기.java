class Solution {
    public int solution(int[] numbers, int k) {
        if((2 * k - 1) % numbers.length == 0) return numbers.length; 
        
        return (2 * k - 1) % numbers.length;
    }
}