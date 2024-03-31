class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for(String[] info : db) {
            if(info[0].equals(id)) {
                if(info[1] .equals(pw)) return "login";
                else return "wrong pw";
            }
        }
        return "fail";
    }
}