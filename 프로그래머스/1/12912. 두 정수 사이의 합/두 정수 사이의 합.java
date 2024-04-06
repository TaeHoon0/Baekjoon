class Solution {
    public long solution(long a, long b) {
        
        return (Math.max(a, b) - Math.min(a, b) + 1) * (a + b) / 2;
    }
}