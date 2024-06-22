import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int hIndexCandidate = n - i; // 현재 인덱스에서의 H-Index 후보
            if (citations[i] >= hIndexCandidate) {
                return hIndexCandidate;
            }
        }
        
        return 0;
    }
}