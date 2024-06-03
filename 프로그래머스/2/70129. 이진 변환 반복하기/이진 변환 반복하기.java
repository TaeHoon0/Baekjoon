class Solution {
    public int[] solution(String s) {
        if (s.equals("")) return new int[2];
        
        int[] answer = new int[2];
        int zeroCnt = 0;
        int cnt = 0;
        
        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();
            int currentZeroCount = 0;

            // 문자열을 순회하면서 0의 개수를 세고, 1만 sb에 추가
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    sb.append(c);
                } else {
                    currentZeroCount++;
                }
            }

            // 0 제거 개수를 누적
            zeroCnt += currentZeroCount;
            // 변환 횟수 증가
            cnt++;

            // sb에 있는 1의 개수를 2진수로 변환
            s = Integer.toBinaryString(sb.length());
        }
        
        answer[0] = cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}
