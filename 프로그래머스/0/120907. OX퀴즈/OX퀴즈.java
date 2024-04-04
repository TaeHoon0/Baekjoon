class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) { 
            String[] equation = quiz[i].split(" ");
            int result = 0;
        
            if(equation[1].equals("+")) result = Integer.parseInt(equation[0]) + Integer.parseInt(equation[2]);
            if(equation[1].equals("-")) result = Integer.parseInt(equation[0]) - Integer.parseInt(equation[2]);
            
            if(result == Integer.parseInt(equation[4])) answer[i] = "O";
            else answer[i] = "X";
        }

        return answer;
    }
}