public class Solution {
    public int solution(int n) {
        int battery = 0;
        
        while (n > 0) {
            if (n % 2 != 0) {       // n이 홀수인 경우 1을 빼고 배터리 사용량을 증가시킴
                n -= 1;
                battery += 1;
            } else {                // 짝수인 경우 2로 나눔
                n /= 2;
            }
        }
        
        return battery;
    }
}