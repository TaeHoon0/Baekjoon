import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(') stack.push('(');
            else if(stack.empty() && c == ')') return false;
            else stack.pop();
        }
        
        if(stack.empty()) return true;
        return false;
    }
}