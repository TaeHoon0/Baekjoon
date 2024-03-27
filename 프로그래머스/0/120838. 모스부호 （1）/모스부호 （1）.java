import java.util.*;

class Solution {
    public String solution(String letter) {
        
        String[] morse = { 
            ".-", "-...", "-.-.", "-..", ".", "..-.","--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] arr = letter.split(" ");
        HashMap<String, String> map = new HashMap<String, String>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < morse.length; i++) {
            char c = (char)('a' + i);
            map.put(morse[i], c + "");
        }
            
        for(String s : arr) {
            sb.append(map.get(s));
        }
        
        return sb.toString();
    }
}