class Solution {
    public String solution(String new_id) {        
        new_id = new_id.toLowerCase();                  // 1단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]", ""); // 2단계
        new_id = new_id.replaceAll("\\.{2,}", ".");     // 3단계
        new_id = new_id.replaceAll("^\\.|\\.$", "");    // 4단계
        if(new_id.equals("")) new_id = "a";             // 5단계
        if(new_id.length() > 15) {
            new_id = new_id.substring(0, 15);  // 6단계
            new_id = new_id.replaceAll("\\.$", ""); 
        }
        if(new_id.length() < 3) {
            char c = new_id.charAt(new_id.length() - 1);
            
            while(new_id.length() < 3) {
                new_id = new_id + c;
            }
        }
        
        return new_id;
    }
}