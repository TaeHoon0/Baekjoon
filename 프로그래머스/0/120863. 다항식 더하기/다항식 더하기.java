import java.util.*;

class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        int var = 0;
        int con = 0;
        List<Integer> variables = new ArrayList<>();
        List<Integer> constants = new ArrayList<>();
        
        for(String s : polynomial.split(" ")) {
            if(s.contains("x")) {
                s = s.replace("x", "");
                if(s.equals("")) variables.add(1);
                else variables.add(Integer.parseInt(s));
            } else if(s.contains("+")) {
                continue;
            } else {
                constants.add(Integer.parseInt(s));
            }
        }
        
        for(int n : variables) {
            var += n;    
        }
        
        for(int n : constants) {
            con += n;
        }
        
        if(var == 1) sb.append("x");
        else if(var != 0) sb.append(Integer.toString(var) + "x");
        if(var != 0 && con != 0) sb.append(" + ");
        if(con != 0) sb.append(Integer.toString(con));
                                              
        return sb.toString();
    }
}