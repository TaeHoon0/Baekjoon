class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            int sum = 0;    // 누른 수
            boolean check = false; // target의 단어가 keymap에 존재하는지 체크 
            
            for(char c : targets[i].toCharArray()) {
                int min = 101;  // 각 targt의 char마다 최소 누른 수
                    
                for(String key : keymap) {
                    for(int j = 0; j < key.length(); j++) {
                        if(c == key.charAt(j)) {
                            min = Math.min(min, j + 1); // j는 0 , 클릭은 1부터 시작
                            break;
                        }
                    }
                }
                
                if(min == 101) check = true;
                sum += min;
            }
            
            if(check) answer[i] = -1;
            else answer[i] = sum;
        }
        
        
        return answer;
    }
}