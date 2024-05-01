import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> scores = new ArrayList<>();    
        StringBuilder sb = new StringBuilder();
        int score = 0;
        
        for(char c : dartResult.toCharArray()) {
            if(Character.isDigit(c)) {  // 숫자일 때 점수 구하기
                sb.append(c);
            } else if (c == 'S' || c == 'D'|| c == 'T') {   // 영역에 따라 계산
                score = Integer.parseInt(sb.toString());
                sb = new StringBuilder();       // 기존 점수 초기화
                
                if(c == 'S') scores.add(score);
                else if(c == 'D') scores.add((int) Math.pow(score, 2));  
                else scores.add((int) Math.pow(score, 3));
            } else if (c == '*' || c == '#') {  // 옵션 계산
                if(scores.size() == 1) {        // 첫 시도일 때 옵션
                    if(c == '*') scores.set(0, scores.get(0) * 2);
                    else scores.set(0, -scores.get(0));
                } else if(scores.size() > 1) {  // 2, 3번째 시도일 때 옵션
                    if(c == '*') {          
                        scores.set(scores.size() - 1, scores.get(scores.size() - 1) * 2);
                        scores.set(scores.size() - 2, scores.get(scores.size() - 2) * 2);
                    } else {
                        scores.set(scores.size() - 1, -scores.get(scores.size() - 1));
                    }
                }
            }
        }
        
        for(int n : scores) answer += n;

        return answer;
    }
}