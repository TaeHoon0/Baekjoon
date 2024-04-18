import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        Queue<String> q3 = new LinkedList<>();
            
        for(String card : cards1) q1.add(card);
        for(String card : cards2) q2.add(card);
        for(String card : goal) q3.add(card);
        
        while(q1.size() > 0 || q2.size() > 0) {
            if(q3.size() == 0) break;
                
            if(q1.size() > 0 && q1.peek().equals(q3.peek())) {
                q1.poll();
                q3.poll();
            } else if(q2.size() > 0 && q2.peek().equals(q3.peek())) {
                q2.poll();
                q3.poll();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}