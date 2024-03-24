class Solution {
    public int solution(int hp) {
        int general = hp / 5;
        hp -= general * 5;
        
        int soldier = hp / 3;
        hp -= soldier * 3;
        
        int ant = hp;
        
        return general + soldier + ant;
    }
}