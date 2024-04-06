import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        for(int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}

