class Solution {
    public int solution(int n) {
        int answer = 0;
        int nowCount = Integer.bitCount(n);

        while(true){
            n++;
            // 2진수로 변환했을 때 1의 갯수를 구하기
            int nextCount = Integer.bitCount(n);

            if(nowCount == nextCount){
                break;
            }
        }

        answer = n;

        return answer;
    }
}