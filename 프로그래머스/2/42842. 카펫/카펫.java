class Solution {
    public int[] solution(int brown, int yellow) {
        int width = 1;
        
        while(true){
            int height = (brown / 2)- width + 2;
            if(width * height - brown == yellow){
                return new int[] {height, width};
            }
            width++;
        }
    }
}