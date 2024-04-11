class Solution {
    public int solution(int[][] sizes) {
        int width = 0;  // 큰 값
        int height = 0; // 작은 값
        
        for(int[] card : sizes) {
            int card_width = Math.max(card[0], card[1]);
            int card_height = Math.min(card[0], card[1]);
            
            if(width < card_width) width = card_width;
            if(height < card_height) height = card_height;
        }
        
        return width * height;
    }
    
}