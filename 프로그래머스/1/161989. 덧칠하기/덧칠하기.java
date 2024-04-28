class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n];
        
        for(int i = 0; i < section.length; i++) {
            wall[section[i] - 1] = true;
        }
        
        for(int i = 0; i < wall.length; i++) {
            if(wall[i]) {
                answer++;
                for(int j = 0; j < m; j++) {
                    if(i + j < wall.length) wall[i + j] = false;
                }
            }
        }
        
        return answer;
    }
}