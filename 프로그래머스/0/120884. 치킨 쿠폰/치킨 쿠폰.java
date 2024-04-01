class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        while(chicken > 0) {
            answer += chicken / 10;
            coupon += chicken % 10;
            chicken /= 10;
        }
        
        while(coupon >= 10) {
            answer++;
            coupon -= 9;
        }       
        
        return answer;
    }
}