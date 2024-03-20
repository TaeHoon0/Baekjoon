class Solution {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분자
        int numer = numer1 * denom2 + numer2 * denom1;
        // 분모
        int denom = denom1 * denom2;
        
        int gcd = gcd(numer, denom);
        
        int[] answer = {numer/gcd, denom/gcd};
        
        return answer;
    }
}