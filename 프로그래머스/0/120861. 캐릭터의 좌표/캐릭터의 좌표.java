class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String key : keyinput) {
            int x = 0;
            int y = 0;
            
            switch(key) {
                case "left":
                    x = -1;
                    break;
                case "right":
                    x = 1;
                    break;
                case "up":
                    y = 1;
                    break;
                case "down":
                    y = -1;
                    break;
            }
            
            if(Math.abs(answer[0] + x) > board[0] / 2) x = 0;
            if(Math.abs(answer[1] + y) > board[1] / 2) y = 0;
            
            answer[0] += x;
            answer[1] += y;
        }
        
        return answer;
    }
}