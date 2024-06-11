import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < elements.length; i++) {
            int n = elements[i];
            set.add(n);
            
            for(int j = i + 1; j < i + elements.length; j++) {
                n += elements[j % elements.length];
                set.add(n);
            }
        }
        
        return set.size();
    }
}